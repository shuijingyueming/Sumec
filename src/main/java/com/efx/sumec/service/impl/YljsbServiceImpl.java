package com.efx.sumec.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.sumec.dao.yljsbMapper;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yljsb;
import com.efx.sumec.model.yljsbExample;
import com.efx.sumec.model.yljsbExample.Criteria;
import com.efx.sumec.service.YljsbService;
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
public class YljsbServiceImpl implements YljsbService {

    @Autowired
    private yljsbMapper jsbMapper;


    @Override
    public yljsb getByid(Integer id) {
        return jsbMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        yljsbExample e1 = new yljsbExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andJsb002Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null){
            c.andSql("((jsb004="+pb.getOthersql1()+
                    ") or ((select xtf003 from ylxtf where xtf001=jsb004 and xtf003="+pb.getOthersql1()+")="+pb.getOthersql1()+
                    ") or ((select t1.xtf003 from ylxtf LEFT JOIN ylxtf as t1 on t1.xtf001=ylxtf.xtf003 where t1.xtf003 ="+pb.getOthersql1()+" and ylxtf.xtf001=jsb004)="+pb.getOthersql1()+"))");
        }
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(yljsb jsb) {
        return jsbMapper.updateByPrimaryKeySelective1(jsb)>0?true:false;
    }

    @Override
    public void deleteById(int id) {
        jsbMapper.deleteByPrimaryKey(id);
    }

    @Override
    public yljsb insert(yljsb jsb) {
        jsbMapper.insertSelective(jsb);
        return jsb;
    }

    @Override
    public void deleteBylxid(int id) {
        yljsbExample e1 = new yljsbExample();
        Criteria c = e1.createCriteria();
        c.andSql("((jsb004="+id+
                ") or ((select xtf003 from ylxtf where xtf001=jsb004 and xtf003="+id+")="+id+
                ") or ((select t1.xtf003 from ylxtf LEFT JOIN ylxtf as t1 on t1.xtf001=ylxtf.xtf003 where t1.xtf003 ="+id+" and ylxtf.xtf001=jsb004)="+id+"))");
        List<yljsb> list=jsbMapper.selectByExample(e1);
        for(yljsb jsb:list){
            jsb.setJsb004(null);
            jsbMapper.updateByPrimaryKey(jsb);
        }
    }

    @Override
    public void deleteById(String id) {
        yljsbExample e1 = new yljsbExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty()){
            String[] ids=id.split("#");
            @SuppressWarnings("unchecked")
            List<Integer> list = (List<Integer>)(List<?>) Arrays.asList(ids);
            list.removeAll(Collections.singleton(null));
            c.andJsb001In(list);
        }
        jsbMapper.deleteByExample(e1);
    }

    @Override
    public yljsb selectByName(String name) {
        yljsbExample e1 = new yljsbExample();
        Criteria c = e1.createCriteria();
        c.andJsb002EqualTo(name);
        List<yljsb> list=jsbMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public List<yljsb> serachAll(Integer yjid, Integer ejid, Integer sjid, Integer bqid, Integer lx, String name) {
        yljsbExample e1 = new yljsbExample();
        Criteria c = e1.createCriteria();
        if(name!=null) c.andJsb002Like(name);
        if(sjid!=null){
            c.andJsb004EqualTo(sjid);
        }else if(ejid!=null){
            c.andSql("((jsb004="+ejid+
                    ") or ((select xtf003 from ylxtf where xtf001=jsb004 and xtf003="+ejid+")="+ejid+ "))");
        }else if(yjid!=null){
            c.andSql("((jsb004="+yjid+
                    ") or ((select xtf003 from ylxtf where xtf001=jsb004 and xtf003="+yjid+")="+yjid+
                    ") or ((select t1.xtf003 from ylxtf LEFT JOIN ylxtf as t1 on t1.xtf001=ylxtf.xtf003 where t1.xtf003 ="+yjid+" and ylxtf.xtf001=jsb004)="+yjid+"))");
        }
        if(bqid!=null)c.andSql("((select count(*) from ylwza where wza002=jsb001 and wza003='"+bqid+"')>0)");
        if(lx !=null)c.andJsb011EqualTo(lx);
        return jsbMapper.selectByExample1(e1);
    }


    public PageBean queryByPage(PageBean pageBean, yljsbExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) jsbMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<yljsb> list = jsbMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<yljsb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<yljsb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<yljsb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(yljsb entity) {
        return false;
    }

    @Override
    public yljsb getOne(Wrapper<yljsb> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<yljsb> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<yljsb> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<yljsb> getBaseMapper() {
        return null;
    }
}
