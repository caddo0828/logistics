package com.logistics.mapper;

import com.logistics.pojo.RoleUserExample;
import com.logistics.pojo.RoleUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserMapper {
    int countByExample(RoleUserExample example);

    int deleteByExample(RoleUserExample example);

    int deleteByPrimaryKey(RoleUserKey key);

    int insert(RoleUserKey record);

    int insertSelective(RoleUserKey record);

    List<RoleUserKey> selectByExample(RoleUserExample example);

    int updateByExampleSelective(@Param("record") RoleUserKey record, @Param("example") RoleUserExample example);

    int updateByExample(@Param("record") RoleUserKey record, @Param("example") RoleUserExample example);
}