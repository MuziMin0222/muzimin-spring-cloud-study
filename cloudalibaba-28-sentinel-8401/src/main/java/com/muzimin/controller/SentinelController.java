package com.muzimin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李煌民
 * @date: 2024-05-15 21:54
 **/
@RestController
@RequestMapping("/sentinel")
public class SentinelController {
    @GetMapping("/testA")
    String testA() {
        return "testA";
    }

    @GetMapping("/testB")
    String testB() {
        return "testB";
    }

    @GetMapping("/hotkey")
    @SentinelResource(value = "hotkey", blockHandler = "deadHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                      @RequestParam(value = "p2", required = false) String p2) {
        return "testHotKey";
    }

    //该方法必须是public修饰
    public String deadHotKey(String p1, String p2, BlockException exception) {
        //sentinel系统默认的提示：Blocked by Sentinel (flow limiting)
        return "deadHotKey";
    }
}
