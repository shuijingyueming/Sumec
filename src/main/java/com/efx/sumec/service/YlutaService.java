package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.yluta;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YlutaService extends IService<yluta> {
    yluta getByid(String id);

    PageBean selectPageBean(PageBean pb);

    boolean update(yluta uta);

    yluta insert(yluta uta);

    void deleteBycpid(int id);

    void deleteBycpid(String id);
}
