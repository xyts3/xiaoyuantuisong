package com.sbs.xyts.mapper;

import com.sbs.xyts.pojo.BbsClass;
import com.sbs.xyts.pojo.BbsClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsClassMapper {
    int countByExample(BbsClassExample example);

    int deleteByExample(BbsClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsClass record);

    int insertSelective(BbsClass record);

    List<BbsClass> selectByExample(BbsClassExample example);

    BbsClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsClass record, @Param("example") BbsClassExample example);

    int updateByExample(@Param("record") BbsClass record, @Param("example") BbsClassExample example);

    int updateByPrimaryKeySelective(BbsClass record);

    int updateByPrimaryKey(BbsClass record);
}