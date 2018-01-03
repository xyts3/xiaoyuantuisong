package com.sbs.xyts.mapper;

import com.sbs.xyts.pojo.Bbs;
import com.sbs.xyts.pojo.BbsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsMapper {
    int countByExample(BbsExample example);

    int deleteByExample(BbsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bbs record);

    int insertSelective(Bbs record);

    List<Bbs> selectByExampleWithBLOBs(BbsExample example);

    List<Bbs> selectByExample(BbsExample example);

    Bbs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bbs record, @Param("example") BbsExample example);

    int updateByExampleWithBLOBs(@Param("record") Bbs record, @Param("example") BbsExample example);

    int updateByExample(@Param("record") Bbs record, @Param("example") BbsExample example);

    int updateByPrimaryKeySelective(Bbs record);

    int updateByPrimaryKeyWithBLOBs(Bbs record);

    int updateByPrimaryKey(Bbs record);
}