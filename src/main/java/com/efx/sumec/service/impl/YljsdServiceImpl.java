package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.efx.sumec.dao.yljsdMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yljsd;
import com.efx.sumec.model.yljsdExample;
import com.efx.sumec.model.yljsdExample.Criteria;
import com.efx.sumec.service.YljsdService;
import com.efx.sumec.service.YljseService;
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
public class YljsdServiceImpl implements YljsdService {

    @Autowired
    private yljsdMapper jsdMapper;


    @Override
    public yljsd getByid(Integer id) {
        return jsdMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        yljsdExample e1 = new yljsdExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andJsd002Like("%"+pb.getOthersql()+"%");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(yljsd jsd) {
        return jsdMapper.updateByPrimaryKeySelective(jsd)>0?true:false;
    }

    @Override
    public void deleteById(int id) {
        jsdMapper.deleteByPrimaryKey(id);
    }

    @Override
    public yljsd insert(yljsd jsd) {
        jsdMapper.insert(jsd);
        return jsd;
    }

    @Override
    public void deleteById(String id) {
        yljsdExample e1 = new yljsdExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJsd001In(list);
        }
        jsdMapper.deleteByExample(e1);
    }

    @Override
    public List<yljsd> serachAll() {
        return jsdMapper.selectByExample(null);
    }

    @Override
    public List<yljsd> getByid(String id) {
        yljsdExample e1 = new yljsdExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJsd001In(list);
        }
        return jsdMapper.selectByExample(e1);
    }


    public PageBean queryByPage(PageBean pageBean, yljsdExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) jsdMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<yljsd> list = jsdMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<yljsd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yljsd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yljsd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yljsd entity) {
        return false;
    }

    @Override
    public yljsd getOne(Wrapper<yljsd> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yljsd> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yljsd> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yljsd> getBaseMapper() {
        return null;
    }
}
