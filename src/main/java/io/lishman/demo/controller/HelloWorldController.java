package io.lishman.demo.controller;

import io.lishman.demo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageService testService;

    HelloWorldController(final MessageService testService) {
        this.testService = testService;
    }

    @GetMapping("message")
    public HelloWorldMessage getHelloWorldMessage() {
        return HelloWorldMessage
                .builder()
                .message(testService.message())
                .build();
    }


}
