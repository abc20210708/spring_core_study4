package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

@Component
public class KimChef implements Chef{



    @Override
    public void cook() {

        System.out.println("김쉐프가 요리합니다.");
    }
}//end class
