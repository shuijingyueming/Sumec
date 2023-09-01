package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.yljse;

public interface YljseService extends IService<yljse> {

    yljse selGetAll();

    yljse insert();

    void update(yljse jse);
}
