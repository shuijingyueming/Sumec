package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylwzaMapper;
import com.efx.sumec.model.ylwza;
import com.efx.sumec.model.ylwzaExample;
import com.efx.sumec.model.ylwzaExample.Criteria;
import com.efx.sumec.service.YlwzaService;
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
public class YlwzaServiceImpl implements YlwzaService {

    @Autowired
    private ylwzaMapper wzaMapper;


    @Override
    public void deleteById(int id) {
        ylwzaExample e1 = new ylwzaExample();
        Criteria c = e1.createCriteria();
        c.andWza003EqualTo(id);
        wzaMapper.deleteByExample(e1);
    }

    @Override
    public ylwza insert(ylwza wza) {
        wzaMapper.insert(wza);
        return wza;
    }

    @Override
    public void deleteById(String id) {
        ylwzaExample e1 = new ylwzaExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andWza003In(list);
        }
        wzaMapper.deleteByExample(e1);
    }

    @Override
    public List<ylwza> getByid(String id) {
        ylwzaExample e1 = new ylwzaExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andWza001In(list);
        }
        return wzaMapper.selectByExample(e1);
    }

    @Override
    public void deleteBycpId(Integer cpid) {
        ylwzaExample e1 = new ylwzaExample();
        Criteria c = e1.createCriteria();
        c.andWza002EqualTo(cpid);
        wzaMapper.deleteByExample(e1);
    }


    @Override
    public boolean saveBatch(Collection<ylwza> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ylwza> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ylwza> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ylwza entity) {
        return false;
    }

    @Override
    public ylwza getOne(Wrapper<ylwza> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ylwza> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<ylwza> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ylwza> getBaseMapper() {
        return null;
    }
}
