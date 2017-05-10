package io.lishman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public HelloWorldMessage getHelloWorldMessage() {
        return HelloWorldMessage
                .builder()
                .message("hello world")
                .build();
    }


}
