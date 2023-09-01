package com.efx.sumec.dao;

import com.efx.sumec.model.ylusf;
import com.efx.sumec.model.ylxtf;
import com.efx.sumec.model.ylxtfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylxtfMapper {
    long countByExample(ylxtfExample example);

    int deleteByExample(ylxtfExample example);

    int deleteByPrimaryKey(Integer xtf001);

    int insert(ylxtf record);

    int insertSelective(ylxtf record);

    List<ylxtf> selectByExample(ylxtfExample example);

    ylxtf selectByPrimaryKey(Integer xtf001);

    int updateByExampleSelective(@Param("record") ylxtf record, @Param("example") ylxtfExample example);

    int updateByExample(@Param("record") ylxtf record, @Param("example") ylxtfExample example);

    int updateByPrimaryKeySelective(ylxtf record);

    int updateByPrimaryKey(ylxtf record);

    List<ylxtf> selectBysjid(Integer id);

    List<ylxtf> selectByExample1(ylxtfExample e1);

    ylxtf selectByPrimaryKey1(Integer xtf001);
}