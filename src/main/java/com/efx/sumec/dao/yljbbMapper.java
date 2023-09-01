package com.efx.sumec.dao;

import com.efx.sumec.model.yljbb;
import com.efx.sumec.model.yljbbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface yljbbMapper {
    long countByExample(yljbbExample example);

    int deleteByExample(yljbbExample example);

    int deleteByPrimaryKey(Integer jbb001);

    int insert(yljbb record);

    int insertSelective(yljbb record);

    List<yljbb> selectByExample(yljbbExample example);

    yljbb selectByPrimaryKey(Integer jbb001);

    int updateByExampleSelective(@Param("record") yljbb record, @Param("example") yljbbExample example);

    int updateByExample(@Param("record") yljbb record, @Param("example") yljbbExample example);

    int updateByPrimaryKeySelective(yljbb record);

    int updateByPrimaryKey(yljbb record);
    List<yljbb> selectBycpid(Integer jbb001);
}