package com.logistics.mapper;

import com.logistics.pojo.ExportProduct;
import com.logistics.pojo.ExportProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportProductMapper {
    int countByExample(ExportProductExample example);

    int deleteByExample(ExportProductExample example);

    int deleteByPrimaryKey(String exportProductId);

    int insert(ExportProduct record);

    int insertSelective(ExportProduct record);

    List<ExportProduct> selectByExample(ExportProductExample example);

    ExportProduct selectByPrimaryKey(String exportProductId);

    int updateByExampleSelective(@Param("record") ExportProduct record, @Param("example") ExportProductExample example);

    int updateByExample(@Param("record") ExportProduct record, @Param("example") ExportProductExample example);

    int updateByPrimaryKeySelective(ExportProduct record);

    int updateByPrimaryKey(ExportProduct record);
}