package com.ruoyi.system.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yangcong
 *
 * 用户表
 * @date create on 2021/4/30
 */
@Data
@TableName("refuel_user")
public class RefuelUser {

    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 手机号
     * */
    @TableField("phone")
    private Long phone;

    /**
     * 是否锁定 0未锁定,1锁定
     * */
    @TableField("is_lock")
    private Integer isLock;

    /**
     * 登录IP
     * */
    @TableField("login_ip")
    private String loginIp;

    /**
     * 最后一次登录的IP
     * */
    @TableField("last_login_ip")
    private String lastLoginIp;

    /**
     * 最后一次的登录时间
     * */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 登录次数
     * */
    @TableField("login_count")
    private Integer loginCount;

    /**
     * 创建时间(自动填充)
     * */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 更新时间(自动填充)
     * */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
