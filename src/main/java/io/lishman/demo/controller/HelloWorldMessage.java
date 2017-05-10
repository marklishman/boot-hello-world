package io.lishman.demo.controller;

import lombok.Builder;
import lombok.Getter;

@Builder
public final class HelloWorldMessage {

    @Getter
    private final String message;

}
