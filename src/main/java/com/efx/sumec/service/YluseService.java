package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yluse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YluseService extends IService<yluse> {

    yluse getLogin(String name, String pwd);

    yluse getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(yluse use);

    yluse insert(yluse use);

    yluse selectByName(String name);

}
