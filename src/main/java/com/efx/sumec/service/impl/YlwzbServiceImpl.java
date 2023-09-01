package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylwzbMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.ylwzb;
import com.efx.sumec.model.ylwzbExample;
import com.efx.sumec.model.ylwzbExample.Criteria;
import com.efx.sumec.service.YlwzbService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
@Service
public class YlwzbServiceImpl implements YlwzbService {

    @Autowired
    private ylwzbMapper wzbMapper;


    @Override
    public ylwzb getByid(Integer id) {
        return wzbMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        ylwzbExample e1 = new ylwzbExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andWzb002Like("%"+pb.getOthersql()+"%");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(ylwzb wzb) {
        return wzbMapper.updateByPrimaryKeySelective(wzb)>0?true:false;
    }

    @Override
    public void deleteById(int id) {
        wzbMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ylwzb insert(ylwzb wzb) {
        wzbMapper.insert(wzb);
        return wzb;
    }

    @Override
    public void deleteById(String id) {
        ylwzbExample e1 = new ylwzbExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andWzb001In(list);
        }
        wzbMapper.deleteByExample(e1);
    }

    @Override
    public List<ylwzb> serachAll() {
        return wzbMapper.selectByExample(null);
    }

    @Override
    public List<ylwzb> getByid(String id) {
        ylwzbExample e1 = new ylwzbExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andWzb001In(list);
        }
        return wzbMapper.selectByExample(e1);
    }

    @Override
    public ylwzb selectByName(String name) {
        ylwzbExample e1 = new ylwzbExample();
        Criteria c = e1.createCriteria();
        c.andWzb002EqualTo(name);
        List<ylwzb> list=wzbMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }


    public PageBean queryByPage(PageBean pageBean, ylwzbExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) wzbMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<ylwzb> list = wzbMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<ylwzb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ylwzb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ylwzb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ylwzb entity) {
        return false;
    }

    @Override
    public ylwzb getOne(Wrapper<ylwzb> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ylwzb> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<ylwzb> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ylwzb> getBaseMapper() {
        return null;
    }
}
