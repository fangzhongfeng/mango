package com.louis.mango.admin.service;

import com.louis.mango.admin.model.SysDict;
import com.louis.mango.core.service.CurdService;

import java.util.List;

/**
 * @author fangzf
 * @create 2020-03-07 23:41
 */
public interface SysDictService extends CurdService<SysDict> {

    /**
     * 根据标签名字查询
     * @param label
     */
    List<SysDict> findByLable(String label);
}
