package com.test.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;

/**
 * 单元测试基类
 * @author 155****3572
 * @date 2022/07/21 16:43
 */
@Slf4j
@ComponentScan("com.test")
public class BaseTest {

    /**
     * 打印测试结果
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    protected void print(Object obj) {
        log.info("测试结果: {}", obj == null ? "无返回" : JSON.toJSONString(obj));
    }

}
