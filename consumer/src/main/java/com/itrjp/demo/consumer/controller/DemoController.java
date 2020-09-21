package com.itrjp.demo.consumer.controller;

import com.itrjp.demo.common.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renjp
 * @date 2020/9/21 14:15
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping
    public Result<String> demo() {
        return Result.success("demo");
    }
}
