package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("ssk")
public class SamsungKeyboard implements Keyboard{

    private Keyboard keyboard;


    public SamsungKeyboard(Keyboard keyboard) {

        this.keyboard = keyboard;
    }

    @Override
    public void info() {
        System.out.println("삼성 키보드입니다.");
    }



}//end class
