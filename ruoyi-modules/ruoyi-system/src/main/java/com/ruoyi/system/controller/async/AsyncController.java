package com.ruoyi.system.controller.async;

import com.ruoyi.common.core.web.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 异步Controller
 * */
@RestController
@RequestMapping("/async/")
public class AsyncController extends BaseController {

    @GetMapping("helloWorld")
    public Mono<String> asyncDemo(){
        return Mono.create(a -> a.success("helloworld"));
    }
}
