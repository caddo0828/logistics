package com.logistics.mapper;

import com.logistics.pojo.ContractProduct;
import com.logistics.pojo.ContractProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractProductMapper {
    int countByExample(ContractProductExample example);

    int deleteByExample(ContractProductExample example);

    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProduct record);

    int insertSelective(ContractProduct record);

    List<ContractProduct> selectByExample(ContractProductExample example);

    ContractProduct selectByPrimaryKey(String contractProductId);

    int updateByExampleSelective(@Param("record") ContractProduct record, @Param("example") ContractProductExample example);

    int updateByExample(@Param("record") ContractProduct record, @Param("example") ContractProductExample example);

    int updateByPrimaryKeySelective(ContractProduct record);

    int updateByPrimaryKey(ContractProduct record);
}