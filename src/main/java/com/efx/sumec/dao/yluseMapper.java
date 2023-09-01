package com.efx.sumec.dao;

import com.efx.sumec.model.yluse;
import com.efx.sumec.model.yluseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface yluseMapper {
    long countByExample(yluseExample example);

    int deleteByExample(yluseExample example);

    int deleteByPrimaryKey(Integer use001);

    int insert(yluse record);

    int insertSelective(yluse record);

    List<yluse> selectByExample(yluseExample example);

    yluse selectByPrimaryKey(Integer use001);

    int updateByExampleSelective(@Param("record") yluse record, @Param("example") yluseExample example);

    int updateByExample(@Param("record") yluse record, @Param("example") yluseExample example);

    int updateByPrimaryKeySelective(yluse record);

    int updateByPrimaryKey(yluse record);

    List<yluse> selectByExampleAndPage(yluseExample example, RowBounds rowBounds);
}