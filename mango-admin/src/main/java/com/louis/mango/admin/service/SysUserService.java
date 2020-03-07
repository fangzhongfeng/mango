package com.louis.mango.admin.service;

import java.util.List;

import com.louis.mango.admin.model.SysUser;
import com.louis.mango.core.service.CurdService;

public interface SysUserService  extends CurdService<SysUser> {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}