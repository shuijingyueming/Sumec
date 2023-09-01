package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.ylwza;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YlwzaService extends IService<ylwza> {
    void deleteById(int id);

    ylwza insert(ylwza wza);

    void deleteById(String id);

    List<ylwza> getByid(String id);

    void deleteBycpId(Integer cpid);
}
