package com.logistics.mapper;

import com.logistics.pojo.ExtCproduct;
import com.logistics.pojo.ExtCproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtCproductMapper {
    int countByExample(ExtCproductExample example);

    int deleteByExample(ExtCproductExample example);

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproduct record);

    int insertSelective(ExtCproduct record);

    List<ExtCproduct> selectByExample(ExtCproductExample example);

    ExtCproduct selectByPrimaryKey(String extCproductId);

    int updateByExampleSelective(@Param("record") ExtCproduct record, @Param("example") ExtCproductExample example);

    int updateByExample(@Param("record") ExtCproduct record, @Param("example") ExtCproductExample example);

    int updateByPrimaryKeySelective(ExtCproduct record);

    int updateByPrimaryKey(ExtCproduct record);
}