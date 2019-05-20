package com.me.mapper;

import com.me.entity.Leaveword;
import com.me.entity.LeavewordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavewordMapper {
    int countByExample(LeavewordExample example);

    int deleteByExample(LeavewordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leaveword record);

    int insertSelective(Leaveword record);

    List<Leaveword> selectByExample(LeavewordExample example);

    Leaveword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leaveword record, @Param("example") LeavewordExample example);

    int updateByExample(@Param("record") Leaveword record, @Param("example") LeavewordExample example);

    int updateByPrimaryKeySelective(Leaveword record);

    int updateByPrimaryKey(Leaveword record);
}