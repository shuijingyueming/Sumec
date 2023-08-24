package com.efx.sumec.dao;

import com.efx.sumec.model.ylusf;
import com.efx.sumec.model.ylusfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylusfMapper {
    long countByExample(ylusfExample example);

    int deleteByExample(ylusfExample example);

    int deleteByPrimaryKey(Integer usf001);

    int insert(ylusf record);

    int insertSelective(ylusf record);

    List<ylusf> selectByExample(ylusfExample example);

    ylusf selectByPrimaryKey(Integer usf001);

    int updateByExampleSelective(@Param("record") ylusf record, @Param("example") ylusfExample example);

    int updateByExample(@Param("record") ylusf record, @Param("example") ylusfExample example);

    int updateByPrimaryKeySelective(ylusf record);

    int updateByPrimaryKey(ylusf record);
}