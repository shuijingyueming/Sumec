package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.ylwzb;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YlwzbService extends IService<ylwzb> {
    ylwzb getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(ylwzb wzb);

    void deleteById(int id);

    ylwzb insert(ylwzb wzb);

    void deleteById(String id);

    List<ylwzb> serachAll();

    List<ylwzb> getByid(String id);

    ylwzb selectByName(String name);
}
