package com.ruoyi.auth.service;

import com.ruoyi.system.api.service.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ruoyi.system.api.model.LoginUser;

/**
 * 登录校验方法
 * 
 * @author yangcong
 */
@Component
public class SysLoginService
{

    @Autowired
    private RemoteUserService remoteUserService;

    /**
     * 登录
     * @param phone 用户名
     */
    public LoginUser login(String phone)
    {
        return remoteUserService.getUserInfo(phone).getData();
    }
}