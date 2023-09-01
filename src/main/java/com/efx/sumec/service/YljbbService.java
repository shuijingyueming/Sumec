package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.yljbb;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YljbbService extends IService<yljbb> {
    void deleteById(int id);

    yljbb insert(yljbb jbb);

    void deleteById(String id);

    List<yljbb> getByid(String id);

    void deleteBycpId(Integer jsb001);
}
