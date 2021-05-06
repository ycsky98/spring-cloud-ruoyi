package com.ruoyi.system.api.factory;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.api.model.LoginUser;
import com.ruoyi.system.api.service.RemoteUserService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 服务调度失败回调
 *
 * @author yangcong
 * */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {

    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    /**
     * 服务调度失败
     * */
    @Override
    public RemoteUserService create(Throwable throwable){

        log.error("用户服务调用失败:{}", throwable.getMessage());

        return new RemoteUserService() {

            @Override
            public R<LoginUser> getUserInfo(String phone) {
                return R.fail("获取用户失败:" + throwable.getMessage());
            }
        };
    }
}
