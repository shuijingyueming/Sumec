package com.efx.sumec.dao;

import com.efx.sumec.model.ylwzb;
import com.efx.sumec.model.ylwzbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylwzbMapper {
    long countByExample(ylwzbExample example);

    int deleteByExample(ylwzbExample example);

    int deleteByPrimaryKey(Integer wzb001);

    int insert(ylwzb record);

    int insertSelective(ylwzb record);

    List<ylwzb> selectByExample(ylwzbExample example);

    ylwzb selectByPrimaryKey(Integer wzb001);

    int updateByExampleSelective(@Param("record") ylwzb record, @Param("example") ylwzbExample example);

    int updateByExample(@Param("record") ylwzb record, @Param("example") ylwzbExample example);

    int updateByPrimaryKeySelective(ylwzb record);

    int updateByPrimaryKey(ylwzb record);
}