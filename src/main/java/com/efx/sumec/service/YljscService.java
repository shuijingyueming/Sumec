package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.yljsc;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YljscService extends IService<yljsc> {
    void deleteById(int id, List<String> list);

    yljsc insert(yljsc jsc);

    void deleteById(String id);

    List<yljsc> getBycpid(String id);

    List<yljsc> seleteBycpId(Integer jsb001);
}
