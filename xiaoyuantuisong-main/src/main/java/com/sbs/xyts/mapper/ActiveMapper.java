package com.sbs.xyts.mapper;

import com.sbs.xyts.pojo.Active;
import com.sbs.xyts.pojo.ActiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiveMapper {
    int countByExample(ActiveExample example);

    int deleteByExample(ActiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Active record);

    int insertSelective(Active record);

    List<Active> selectByExampleWithBLOBs(ActiveExample example);

    List<Active> selectByExample(ActiveExample example);

    Active selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Active record, @Param("example") ActiveExample example);

    int updateByExampleWithBLOBs(@Param("record") Active record, @Param("example") ActiveExample example);

    int updateByExample(@Param("record") Active record, @Param("example") ActiveExample example);

    int updateByPrimaryKeySelective(Active record);

    int updateByPrimaryKeyWithBLOBs(Active record);

    int updateByPrimaryKey(Active record);
}