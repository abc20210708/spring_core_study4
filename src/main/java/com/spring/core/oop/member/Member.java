package com.spring.core.oop.member;


import lombok.*;

@Setter ///lombok라이브러리가 제공하는 기능
@AllArgsConstructor ///모든인자 처리
@NoArgsConstructor///기본생성자도
@Getter
@ToString
public class Member {

    private Long id; //회원 식별 코드
    private String name; //회원명
    private Grade grade; //회원등급

    //자바 빈즈 규약
    //기본 생성자, 모든필드를 초기화 생상자
    //getter, setter, toString, hashCode...




}//end class
