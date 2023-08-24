package com.efx.sumec.dao;

import com.efx.sumec.model.yljse;
import com.efx.sumec.model.yljseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface yljseMapper {
    long countByExample(yljseExample example);

    int deleteByExample(yljseExample example);

    int deleteByPrimaryKey(Integer jse001);

    int insert(yljse record);

    int insertSelective(yljse record);

    List<yljse> selectByExample(yljseExample example);

    yljse selectByPrimaryKey(Integer jse001);

    int updateByExampleSelective(@Param("record") yljse record, @Param("example") yljseExample example);

    int updateByExample(@Param("record") yljse record, @Param("example") yljseExample example);

    int updateByPrimaryKeySelective(yljse record);

    int updateByPrimaryKey(yljse record);
}