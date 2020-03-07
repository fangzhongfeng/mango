package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysLog;
import com.louis.mango.admin.model.SysLoginLog;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value = "userName") String userName);
    
    List<SysLog> findPageByStatus(@Param(value = "status") String status);
}