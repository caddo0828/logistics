package com.logistics.mapper;

import com.logistics.pojo.PackingList;
import com.logistics.pojo.PackingListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackingListMapper {
    int countByExample(PackingListExample example);

    int deleteByExample(PackingListExample example);

    int deleteByPrimaryKey(String packingListId);

    int insert(PackingList record);

    int insertSelective(PackingList record);

    List<PackingList> selectByExample(PackingListExample example);

    PackingList selectByPrimaryKey(String packingListId);

    int updateByExampleSelective(@Param("record") PackingList record, @Param("example") PackingListExample example);

    int updateByExample(@Param("record") PackingList record, @Param("example") PackingListExample example);

    int updateByPrimaryKeySelective(PackingList record);

    int updateByPrimaryKey(PackingList record);
}