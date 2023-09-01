package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.ylxxz;

public interface YlxxzService extends IService<ylxxz> {

    ylxxz selGetAll();

    ylxxz insert();

    void update(ylxxz xxz);
}
