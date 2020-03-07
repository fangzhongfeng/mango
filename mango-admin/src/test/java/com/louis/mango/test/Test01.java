package com.louis.mango.test;

import com.louis.mango.admin.dao.SysUserMapper;
import com.louis.mango.admin.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author fangzf
 * @create 2020-03-06 23:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

    @Autowired
    private SysUserMapper  sysUserMapper;


    @Test
    public  void   test01(){
        List<SysUser> sysUsers = sysUserMapper.findPage();
        System.out.println(sysUsers);

    }
}
