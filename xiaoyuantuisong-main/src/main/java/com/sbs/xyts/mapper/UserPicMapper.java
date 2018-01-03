package com.sbs.xyts.mapper;

import com.sbs.xyts.pojo.UserPic;
import com.sbs.xyts.pojo.UserPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPicMapper {
    int countByExample(UserPicExample example);

    int deleteByExample(UserPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPic record);

    int insertSelective(UserPic record);

    List<UserPic> selectByExample(UserPicExample example);

    UserPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPic record, @Param("example") UserPicExample example);

    int updateByExample(@Param("record") UserPic record, @Param("example") UserPicExample example);

    int updateByPrimaryKeySelective(UserPic record);

    int updateByPrimaryKey(UserPic record);
}