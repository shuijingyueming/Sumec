package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.yljscMapper;
import com.efx.sumec.model.yljsc;
import com.efx.sumec.model.yljscExample;
import com.efx.sumec.model.yljscExample.Criteria;
import com.efx.sumec.service.YljscService;
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
public class YljscServiceImpl implements YljscService {

    @Autowired
    private yljscMapper jscMapper;


    @Override
    public void deleteById(int id, List<String> list) {
        yljscExample e1 = new yljscExample();
        Criteria c = e1.createCriteria();
        c.andJsc002EqualTo(id);
        c.andJsc003In(list);
        jscMapper.deleteByExample(e1);
    }

    @Override
    public yljsc insert(yljsc jsc) {
        jscMapper.insert(jsc);
        return jsc;
    }

    @Override
    public void deleteById(String id) {
        yljscExample e1 = new yljscExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJsc002In(list);
        }
        jscMapper.deleteByExample(e1);
    }

    @Override
    public List<yljsc> getBycpid(String id) {
        yljscExample e1 = new yljscExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJsc002In(list);
        }
        return jscMapper.selectByExample(e1);
    }

    @Override
    public List<yljsc> seleteBycpId(Integer cpId) {
        yljscExample e1 = new yljscExample();
        Criteria c = e1.createCriteria();
        c.andJsc002EqualTo(cpId);
        return jscMapper.selectByExample(e1);
    }


    @Override
    public boolean saveBatch(Collection<yljsc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yljsc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yljsc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yljsc entity) {
        return false;
    }

    @Override
    public yljsc getOne(Wrapper<yljsc> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yljsc> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yljsc> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yljsc> getBaseMapper() {
        return null;
    }
}
