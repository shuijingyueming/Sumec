package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yljsb;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YljsbService extends IService<yljsb> {
    yljsb getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(yljsb jsb);

    void deleteById(int id);

    yljsb insert(yljsb jsb);

    void deleteBylxid(int id);

    void deleteById(String id);

    yljsb selectByName(String name);

    List<yljsb> serachAll(Integer yjid, Integer ejid, Integer sjid, Integer bqid, Integer lx);
}
