package com.efx.sumec.dao;

import com.efx.sumec.model.yljsb;
import com.efx.sumec.model.yljsbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface yljsbMapper {
    long countByExample(yljsbExample example);

    int deleteByExample(yljsbExample example);

    int deleteByPrimaryKey(Integer jsb001);

    int insert(yljsb record);

    int insertSelective(yljsb record);

    List<yljsb> selectByExample(yljsbExample example);

    yljsb selectByPrimaryKey(Integer jsb001);

    int updateByExampleSelective(@Param("record") yljsb record, @Param("example") yljsbExample example);

    int updateByExample(@Param("record") yljsb record, @Param("example") yljsbExample example);

    int updateByPrimaryKeySelective(yljsb record);

    int updateByPrimaryKey(yljsb record);

    List<yljsb> selectByExampleAndPage(yljsbExample example, RowBounds rowBounds);

    List<yljsb> selectByExample1(yljsbExample e1);

    int updateByPrimaryKeySelective1(yljsb jsb);
}