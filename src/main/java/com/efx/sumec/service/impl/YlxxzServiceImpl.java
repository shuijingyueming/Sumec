package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylxxzMapper;
import com.efx.sumec.model.*;
import com.efx.sumec.service.YlxxzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
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
public class YlxxzServiceImpl implements YlxxzService {

    @Autowired
    public ylxxzMapper xxzMapper;

    @Override
    public boolean saveBatch(Collection<ylxxz> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ylxxz> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ylxxz> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ylxxz entity) {
        return false;
    }

    @Override
    public ylxxz getOne(Wrapper<ylxxz> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ylxxz> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<ylxxz> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ylxxz> getBaseMapper() {
        return null;
    }

    @Override
    public ylxxz selGetAll() {
        ylxxzExample e1= new ylxxzExample();
        e1.setOrderByClause("xxz001 desc");
        List<ylxxz> list = xxzMapper.selectByExample(null);
        return list!=null&&list.size()>0?list.get(0):this.insert();
    }

    @Override
    public ylxxz insert() {
        ylxxz xxz=new ylxxz();
        xxz.setXxz001(1);
        xxz.setXxz002("A");
        xxz.setXxz004(1);
        xxzMapper.insert(xxz);
        return xxz;
    }

    @Override
    public void update(ylxxz xxz) {
        xxzMapper.updateByPrimaryKeySelective(xxz);
    }

}
