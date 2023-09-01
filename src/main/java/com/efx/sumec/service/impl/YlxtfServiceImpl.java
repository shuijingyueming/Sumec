package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylxtfMapper;
import com.efx.sumec.model.ylxtf;
import com.efx.sumec.model.ylxtfExample;
import com.efx.sumec.model.ylxtfExample.Criteria;
import com.efx.sumec.service.YlxtfService;
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
public class YlxtfServiceImpl implements YlxtfService {

    @Autowired
    private ylxtfMapper xtfMapper;

    @Override
    public void delete(int id) {
        xtfMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteById(int id) {
        ylxtfExample e1 = new ylxtfExample();
        Criteria c = e1.createCriteria();
        c.andXtf003EqualTo(id);
        xtfMapper.deleteByExample(e1);
    }

    @Override
    public ylxtf insert(ylxtf xtf) {
        xtfMapper.insertSelective(xtf);
        return xtf;
    }

    @Override
    public ylxtf getByid(Integer id) {
        return xtfMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ylxtf> selectBytype() {
        ylxtfExample e1 = new ylxtfExample();
        Criteria c = e1.createCriteria();
        c.andXtf003IsNull();
        return xtfMapper.selectByExample1(e1);
    }

    @Override
    public void update(ylxtf item) {
        xtfMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public List<ylxtf> selectBysjid(Integer sjid) {
        ylxtfExample e1 = new ylxtfExample();
        Criteria c = e1.createCriteria();
        if(sjid!=null){
            c.andXtf003EqualTo(sjid);
        }else{
            c.andXtf003IsNull();
        }
        return xtfMapper.selectByExample(e1);
    }


    @Override
    public boolean saveBatch(Collection<ylxtf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ylxtf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ylxtf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ylxtf entity) {
        return false;
    }

    @Override
    public ylxtf getOne(Wrapper<ylxtf> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ylxtf> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<ylxtf> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ylxtf> getBaseMapper() {
        return null;
    }
}
