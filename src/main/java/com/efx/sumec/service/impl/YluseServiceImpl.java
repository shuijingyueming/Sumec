package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.yluseMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yluse;
import com.efx.sumec.model.yluseExample;
import com.efx.sumec.model.yluseExample.Criteria;
import com.efx.sumec.service.YluseService;
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
public class YluseServiceImpl implements YluseService {

    @Autowired
    private yluseMapper useMapper;

    @Override
    public yluse getLogin(String name, String pwd) {
        yluseExample cx = new yluseExample();
        Criteria c = cx.createCriteria();
        c.andUse002EqualTo(name);
        c.andUse003EqualTo(pwd);
        List<yluse> uselist = useMapper.selectByExample(cx);
        return uselist.size() > 0 ? uselist.get(0) : null;
    }

    @Override
    public yluse getByid(Integer id) {
        return useMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        yluseExample e1 = new yluseExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andUse002Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null) c.andUse005Like("%"+pb.getOthersql1()+"%");
        c.andUse002NotEqualTo("admin");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(yluse use) {
        return useMapper.updateByPrimaryKeySelective(use)>0?true:false;
    }

    @Override
    public yluse insert(yluse use) {
        useMapper.insertSelective(use);
        return use;
    }

    @Override
    public yluse selectByName(String name) {
        yluseExample e1 = new yluseExample();
        yluseExample.Criteria c = e1.createCriteria();
        c.andUse002EqualTo(name);
        List<yluse> list=useMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    public PageBean queryByPage(PageBean pageBean, yluseExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) useMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<yluse> list = useMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }


    @Override
    public boolean saveBatch(Collection<yluse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yluse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yluse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yluse entity) {
        return false;
    }

    @Override
    public yluse getOne(Wrapper<yluse> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yluse> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yluse> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yluse> getBaseMapper() {
        return null;
    }

}
