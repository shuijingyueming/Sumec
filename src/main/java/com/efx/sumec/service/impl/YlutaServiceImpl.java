package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.ylutaMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yluta;
import com.efx.sumec.model.ylutaExample;
import com.efx.sumec.model.ylutaExample.Criteria;
import com.efx.sumec.service.YlutaService;
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
public class YlutaServiceImpl implements YlutaService {

    @Autowired
    private ylutaMapper utaMapper;


    @Override
    public yluta getByid(String id) {
        return utaMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        ylutaExample e1 = new ylutaExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andUta005Like("%"+pb.getOthersql()+"%");
        e1.setOrderByClause("uta006 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(yluta uta) {
        return utaMapper.updateByPrimaryKeySelective(uta)>0?true:false;
    }

    @Override
    public yluta insert(yluta uta) {
        utaMapper.insert(uta);
        return uta;
    }

    @Override
    public void deleteBycpid(int id) {
        ylutaExample e1 = new ylutaExample();
        Criteria c = e1.createCriteria();
        c.andUta003EqualTo(id);
        List<yluta> list=utaMapper.selectByExample(e1);
        for(yluta uta:list){
            uta.setUta003(null);
            utaMapper.updateByPrimaryKey(uta);
        }
    }

    @Override
    public void deleteBycpid(String id) {
        ylutaExample e1 = new ylutaExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andUta003In(list);
        }
        List<yluta> list=utaMapper.selectByExample(e1);
        for(yluta uta:list){
            uta.setUta003(null);
            utaMapper.updateByPrimaryKey(uta);
        }
    }


    public PageBean queryByPage(PageBean pageBean, ylutaExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) utaMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<yluta> list = utaMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<yluta> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yluta> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yluta> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yluta entity) {
        return false;
    }

    @Override
    public yluta getOne(Wrapper<yluta> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yluta> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yluta> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yluta> getBaseMapper() {
        return null;
    }
}
