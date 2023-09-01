package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylusfMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.ylusf;
import com.efx.sumec.model.ylusfExample;
import com.efx.sumec.model.ylusfExample.Criteria;
import com.efx.sumec.service.YlusfService;
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
public class YlusfServiceImpl implements YlusfService {

    @Autowired
    private ylusfMapper usfMapper;


    @Override
    public ylusf getByid(Integer id) {
        return usfMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        ylusfExample e1 = new ylusfExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andUsf002Like("%"+pb.getOthersql()+"%");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(ylusf usf) {
        return usfMapper.updateByPrimaryKeySelective(usf)>0?true:false;
    }

    @Override
    public void deleteById(int id) {
        usfMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ylusf insert(ylusf usf) {
        usfMapper.insert(usf);
        return usf;
    }

    @Override
    public void deleteById(String id) {
        ylusfExample e1 = new ylusfExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andUsf001In(list);
        }
        usfMapper.deleteByExample(e1);
    }

    @Override
    public List<ylusf> serachAll() {
        return usfMapper.selectByExample(null);
    }

    @Override
    public List<ylusf> getByid(String id) {
        ylusfExample e1 = new ylusfExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andUsf001In(list);
        }
        return usfMapper.selectByExample(e1);
    }

    @Override
    public ylusf selectByName(String name) {
        ylusfExample e1 = new ylusfExample();
        Criteria c = e1.createCriteria();
        c.andUsf002EqualTo(name);
        List<ylusf> list=usfMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }


    public PageBean queryByPage(PageBean pageBean, ylusfExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) usfMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<ylusf> list = usfMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<ylusf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ylusf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ylusf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ylusf entity) {
        return false;
    }

    @Override
    public ylusf getOne(Wrapper<ylusf> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ylusf> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<ylusf> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ylusf> getBaseMapper() {
        return null;
    }
}
