package com.spring.core.oop.computer;


import org.springframework.stereotype.Component;

@Component("hpm")
public class HpMouse implements Mouse{


    @Override
    public void info() {
        System.out.println("hp 마우스 입니다.");
    }
}
