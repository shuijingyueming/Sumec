package com.efx.sumec.dao;

import com.efx.sumec.model.yljsc;
import com.efx.sumec.model.yljscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface yljscMapper {
    long countByExample(yljscExample example);

    int deleteByExample(yljscExample example);

    int deleteByPrimaryKey(Integer jsc001);

    int insert(yljsc record);

    int insertSelective(yljsc record);

    List<yljsc> selectByExample(yljscExample example);

    yljsc selectByPrimaryKey(Integer jsc001);

    int updateByExampleSelective(@Param("record") yljsc record, @Param("example") yljscExample example);

    int updateByExample(@Param("record") yljsc record, @Param("example") yljscExample example);

    int updateByPrimaryKeySelective(yljsc record);

    int updateByPrimaryKey(yljsc record);
}