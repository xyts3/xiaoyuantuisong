package com.sbs.xyts.mapper;

import com.sbs.xyts.pojo.Website;
import com.sbs.xyts.pojo.WebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteMapper {
    int countByExample(WebsiteExample example);

    int deleteByExample(WebsiteExample example);

    int deleteByPrimaryKey(String websiteUrl);

    int insert(Website record);

    int insertSelective(Website record);

    List<Website> selectByExampleWithBLOBs(WebsiteExample example);

    List<Website> selectByExample(WebsiteExample example);

    Website selectByPrimaryKey(String websiteUrl);

    int updateByExampleSelective(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByExampleWithBLOBs(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByExample(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByPrimaryKeySelective(Website record);

    int updateByPrimaryKeyWithBLOBs(Website record);

    int updateByPrimaryKey(Website record);
}