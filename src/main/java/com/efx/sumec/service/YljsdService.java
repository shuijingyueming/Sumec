package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yljsd;


import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YljsdService extends IService<yljsd> {
    yljsd getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(yljsd jsd);

    void deleteById(int id);

    yljsd insert(yljsd jsd);

    void deleteById(String id);

    List<yljsd> serachAll();

    List<yljsd> getByid(String id);

}
