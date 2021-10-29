package com.spring.core.oop.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hpmm")
public class HpMonitor implements Monitor{



    @Override
    public void info() {
        System.out.println("hp 모니터 입니다.");
    }
}
