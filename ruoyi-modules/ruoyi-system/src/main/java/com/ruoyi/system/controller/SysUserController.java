package com.ruoyi.system.controller;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.api.model.LoginUser;
import com.ruoyi.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class SysUserController {

    @Autowired
    private UserService userService;

    /**
     * 通过用户名查询用户信息
     *
     * @param phone 用户名
     * @return 结果
     */
    @GetMapping(value = "info/{phone}")
    public R<LoginUser> getUserInfo(@PathVariable("phone") String phone){
        return R.ok(userService.queryUserByPhone(phone));
    }
}
