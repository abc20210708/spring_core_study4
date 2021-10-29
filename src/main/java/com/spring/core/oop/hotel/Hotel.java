package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //이 클래스를 스프링컨테이너에 등록:
            // 스프링에게 객체생성 제어권을 넘김
public class Hotel {

    ///프로그램 실행 중에 식당이 바뀌지 않도록 final
    //필드 주입
  /*  @Autowired //필요한 의존객체를 자동주입하겠다.
    @Qualifier("frenchRestaurant") //구체적인구현체를 특정(구현체 이름)*/
    private  Restaurant restaurant;

    //생성자주입
    @Autowired
    public Hotel(@Qualifier("fr") Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    //Setter 주입(수정자 주입)
/*    @Autowired
    @Qualifier("frenchRestaurant")
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    //레스토랑 예약기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();

    }



}//end class
