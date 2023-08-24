package com.efx.sumec.dao;

import com.efx.sumec.model.yljsd;
import com.efx.sumec.model.yljsdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface yljsdMapper {
    long countByExample(yljsdExample example);

    int deleteByExample(yljsdExample example);

    int deleteByPrimaryKey(Integer jsd001);

    int insert(yljsd record);

    int insertSelective(yljsd record);

    List<yljsd> selectByExample(yljsdExample example);

    yljsd selectByPrimaryKey(Integer jsd001);

    int updateByExampleSelective(@Param("record") yljsd record, @Param("example") yljsdExample example);

    int updateByExample(@Param("record") yljsd record, @Param("example") yljsdExample example);

    int updateByPrimaryKeySelective(yljsd record);

    int updateByPrimaryKey(yljsd record);
}