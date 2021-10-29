package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("ssm")
public class SamsungMouse implements Mouse {

    @Override
    public void info() {
        System.out.println(" 삼성 마우스 입니다.");
    }
}
