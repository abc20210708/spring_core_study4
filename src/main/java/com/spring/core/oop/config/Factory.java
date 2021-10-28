package com.spring.core.oop.config;

import com.spring.core.oop.member.MemberController;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;
import com.spring.core.oop.order.OrderController;

//역할: 객체를 생성해서 필요한 곳에 넣어주는 역할
public class Factory {

    //회원저장소 객체를 만드는 기능
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
        ///여기만 고쳐도 DB,메모리
        ///의존성 주입
    }

    //회원컨드롤러 객체를 만드는 기능
    public MemberController memberController() {
        return new MemberController(memberRepository());
    }
    //주문컨트롤러 객체를 만드는 기능
    public OrderController orderController() {
        return  new OrderController(memberRepository());
    }

}//end class
