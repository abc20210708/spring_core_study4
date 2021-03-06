package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fr")
public class FrenchRestaurant implements Restaurant{

    private final Chef chef;

    @Autowired
    public FrenchRestaurant(@Qualifier("kimChef") Chef chef) {

        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }

}//end class
