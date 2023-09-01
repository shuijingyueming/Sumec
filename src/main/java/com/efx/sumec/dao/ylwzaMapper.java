package com.efx.sumec.dao;

import com.efx.sumec.model.ylwza;
import com.efx.sumec.model.ylwzaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylwzaMapper {
    long countByExample(ylwzaExample example);

    int deleteByExample(ylwzaExample example);

    int deleteByPrimaryKey(Integer wza001);

    int insert(ylwza record);

    int insertSelective(ylwza record);

    List<ylwza> selectByExample(ylwzaExample example);

    ylwza selectByPrimaryKey(Integer wza001);

    int updateByExampleSelective(@Param("record") ylwza record, @Param("example") ylwzaExample example);

    int updateByExample(@Param("record") ylwza record, @Param("example") ylwzaExample example);

    int updateByPrimaryKeySelective(ylwza record);

    int updateByPrimaryKey(ylwza record);
    List<ylwza> selectBycpid(Integer wza001);
}