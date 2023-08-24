package com.efx.sumec.dao;

import com.efx.sumec.model.ylxxz;
import com.efx.sumec.model.ylxxzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ylxxzMapper {
    long countByExample(ylxxzExample example);

    int deleteByExample(ylxxzExample example);

    int deleteByPrimaryKey(Integer xxz001);

    int insert(ylxxz record);

    int insertSelective(ylxxz record);

    List<ylxxz> selectByExample(ylxxzExample example);

    ylxxz selectByPrimaryKey(Integer xxz001);

    int updateByExampleSelective(@Param("record") ylxxz record, @Param("example") ylxxzExample example);

    int updateByExample(@Param("record") ylxxz record, @Param("example") ylxxzExample example);

    int updateByPrimaryKeySelective(ylxxz record);

    int updateByPrimaryKey(ylxxz record);
}