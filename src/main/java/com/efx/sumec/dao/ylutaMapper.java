package com.efx.sumec.dao;

import com.efx.sumec.model.yluta;
import com.efx.sumec.model.ylutaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylutaMapper {
    long countByExample(ylutaExample example);

    int deleteByExample(ylutaExample example);

    int deleteByPrimaryKey(String uta001);

    int insert(yluta record);

    int insertSelective(yluta record);

    List<yluta> selectByExample(ylutaExample example);

    yluta selectByPrimaryKey(String uta001);

    int updateByExampleSelective(@Param("record") yluta record, @Param("example") ylutaExample example);

    int updateByExample(@Param("record") yluta record, @Param("example") ylutaExample example);

    int updateByPrimaryKeySelective(yluta record);

    int updateByPrimaryKey(yluta record);
}