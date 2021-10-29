package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("smo")
public class SamsungMonitor implements Monitor{

    private Monitor monitor;

    public SamsungMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void info() {
        System.out.println("삼성 모니터 입니다.");
    }

}
