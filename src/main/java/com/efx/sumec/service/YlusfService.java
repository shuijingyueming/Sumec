package com.efx.sumec.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.sumec.model.PageBean;
import com.efx.sumec.model.ylusf;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface YlusfService extends IService<ylusf> {
    ylusf getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(ylusf usf);

    void deleteById(int id);

    ylusf insert(ylusf usf);

    void deleteById(String id);

    List<ylusf> serachAll();

    List<ylusf> getByid(String id);

    ylusf selectByName(String name);
}
