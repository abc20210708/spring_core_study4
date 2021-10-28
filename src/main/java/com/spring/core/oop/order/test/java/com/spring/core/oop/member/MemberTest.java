package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    //테스트 메서드 생성
    ////메인메서드 역할
    @Test
    void lombokTest() {
        Member member = new Member();
        member.setId(1L);
        member.setName("홍길동");
        member.setGrade(Grade.VIP);

        Member member1
                = new Member(2L, "박영희", Grade.BASIC);
        String name = member1.getName();
        System.out.println("name = " + name);

        System.out.println("member = " + member);


    }////
    
}//end class//