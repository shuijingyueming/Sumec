package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.yljseMapper;
import com.efx.sumec.model.yljse;
import com.efx.sumec.model.yljseExample;
import com.efx.sumec.service.YljseService;
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
public class YljseServiceImpl implements YljseService {

    @Autowired
    public yljseMapper jseMapper;

    @Override
    public boolean saveBatch(Collection<yljse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yljse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yljse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yljse entity) {
        return false;
    }

    @Override
    public yljse getOne(Wrapper<yljse> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yljse> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yljse> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yljse> getBaseMapper() {
        return null;
    }

    @Override
    public yljse selGetAll() {
        yljseExample e1= new yljseExample();
        e1.setOrderByClause("jse001 desc");
        List<yljse> list = jseMapper.selectByExample(null);
        return list!=null&&list.size()>0?list.get(0):this.insert();
    }

    @Override
    public yljse insert() {
        yljse jse=new yljse();
        jse.setJse001(1);
        jseMapper.insert(jse);
        return jse;
    }

    @Override
    public void update(yljse jse) {
        jseMapper.updateByPrimaryKeySelective(jse);
    }

}
