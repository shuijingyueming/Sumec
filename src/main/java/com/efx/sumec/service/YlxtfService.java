package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.ylxtf;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YlxtfService extends IService<ylxtf> {
    void delete(int id);
    void deleteById(int id);
    ylxtf insert(ylxtf xtf);
    ylxtf getByid(Integer id);
    List<ylxtf> selectBytype();
    void update(ylxtf item);
    List<ylxtf>  selectBysjid(Integer sjid);
}
