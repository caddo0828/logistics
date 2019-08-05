package com.logistics.mapper;

import com.logistics.pojo.OnlineInfo;
import com.logistics.pojo.OnlineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineInfoMapper {
    int countByExample(OnlineInfoExample example);

    int deleteByExample(OnlineInfoExample example);

    int insert(OnlineInfo record);

    int insertSelective(OnlineInfo record);

    List<OnlineInfo> selectByExample(OnlineInfoExample example);

    int updateByExampleSelective(@Param("record") OnlineInfo record, @Param("example") OnlineInfoExample example);

    int updateByExample(@Param("record") OnlineInfo record, @Param("example") OnlineInfoExample example);
}