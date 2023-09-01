package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.yljbbMapper;
import com.efx.sumec.model.yljbb;
import com.efx.sumec.model.yljbbExample;
import com.efx.sumec.model.yljbbExample.Criteria;
import com.efx.sumec.service.YljbbService;
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
public class YljbbServiceImpl implements YljbbService {

    @Autowired
    private yljbbMapper jbbMapper;


    @Override
    public void deleteById(int id) {
        yljbbExample e1 = new yljbbExample();
        Criteria c = e1.createCriteria();
        c.andJbb002EqualTo(id);
        jbbMapper.deleteByExample(e1);
    }

    @Override
    public yljbb insert(yljbb jbb) {
        jbbMapper.insert(jbb);
        return jbb;
    }

    @Override
    public void deleteById(String id) {
        yljbbExample e1 = new yljbbExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJbb002In(list);
        }
        jbbMapper.deleteByExample(e1);
    }

    @Override
    public List<yljbb> getByid(String id) {
        yljbbExample e1 = new yljbbExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJbb001In(list);
        }
        return jbbMapper.selectByExample(e1);
    }

    @Override
    public void deleteBycpId(Integer id) {
        yljbbExample e1 = new yljbbExample();
        Criteria c = e1.createCriteria();
        c.andJbb003EqualTo(id);
        jbbMapper.deleteByExample(e1);
    }


    @Override
    public boolean saveBatch(Collection<yljbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yljbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yljbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yljbb entity) {
        return false;
    }

    @Override
    public yljbb getOne(Wrapper<yljbb> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yljbb> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yljbb> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yljbb> getBaseMapper() {
        return null;
    }
}
