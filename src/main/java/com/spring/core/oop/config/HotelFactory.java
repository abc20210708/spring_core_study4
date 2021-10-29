package com.spring.core.oop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 컨테이너 설정파일 등록
///커피콩 담는 유리병 - 스프링 컨테이너

//컨테이너 탐색 범위 설정
///Component 커피 콩
@ComponentScan(basePackages = "com.spring.core.oop.hotel")
///구체적으로 경로를 적어주세요.
public class HotelFactory {

}//end class
