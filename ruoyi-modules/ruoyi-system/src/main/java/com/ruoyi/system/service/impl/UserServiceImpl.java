package com.ruoyi.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.core.utils.ServletUtils;
import com.ruoyi.common.core.utils.SnowflakeIdUtil;
import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.common.core.utils.ip.IpUtils;
import com.ruoyi.system.api.model.LoginUser;
import com.ruoyi.system.domain.entity.RefuelUser;
import com.ruoyi.system.mapper.UserMapper;
import com.ruoyi.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;

/**
 * @author yangcong
 *
 * @date create on 2021/4/30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, RefuelUser> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据手机号查询用户
     * @param phone 手机号
     * @return {@link RefuelUser}
     * */
    @Override
    public LoginUser queryUserByPhone(String phone) {

        return null;
    }
}
