package com.ruoyi.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.api.model.LoginUser;
import com.ruoyi.system.domain.entity.RefuelUser;

/**
 * @author yangcong
 *
 * @date create on 2021/4/30
 */
public interface UserService extends IService<RefuelUser> {

    /**
     * 根据手机号查询用户
     * @param phone 手机号
     * @return {@link LoginUser}
     * */
    public LoginUser queryUserByPhone(String phone);
}
