package com.logistics.mapper;

import com.logistics.pojo.ExtEproduct;
import com.logistics.pojo.ExtEproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtEproductMapper {
    int countByExample(ExtEproductExample example);

    int deleteByExample(ExtEproductExample example);

    int deleteByPrimaryKey(String extEproductId);

    int insert(ExtEproduct record);

    int insertSelective(ExtEproduct record);

    List<ExtEproduct> selectByExample(ExtEproductExample example);

    ExtEproduct selectByPrimaryKey(String extEproductId);

    int updateByExampleSelective(@Param("record") ExtEproduct record, @Param("example") ExtEproductExample example);

    int updateByExample(@Param("record") ExtEproduct record, @Param("example") ExtEproductExample example);

    int updateByPrimaryKeySelective(ExtEproduct record);

    int updateByPrimaryKey(ExtEproduct record);
}