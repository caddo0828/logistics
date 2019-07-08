package com.logistics.mapper;

import com.logistics.pojo.Export;
import com.logistics.pojo.ExportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportMapper {
    int countByExample(ExportExample example);

    int deleteByExample(ExportExample example);

    int deleteByPrimaryKey(String exportId);

    int insert(Export record);

    int insertSelective(Export record);

    List<Export> selectByExample(ExportExample example);

    Export selectByPrimaryKey(String exportId);

    int updateByExampleSelective(@Param("record") Export record, @Param("example") ExportExample example);

    int updateByExample(@Param("record") Export record, @Param("example") ExportExample example);

    int updateByPrimaryKeySelective(Export record);

    int updateByPrimaryKey(Export record);
}