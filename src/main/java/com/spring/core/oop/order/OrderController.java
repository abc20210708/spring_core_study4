package com.spring.core.oop.order;


import com.spring.core.oop.member.DatabaseMemberRepository;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;

//책임: 적당한 회원 저장소에서 회원정보를 조회한 후
//     주문 정보를 생성해야 한다.
public class OrderController {

    private MemberRepository memberRepository;

    public OrderController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*직접 관여 (x)
    * public OderController() {
        memberRepository = new DatabaseMemberRepository();
        * or Memory
        * ///클라이언트가 서버에 관여. 식당이모
        ///철저하게 몰라야 함.
        ///변경에는 닫혀 있어야 한다.
        ///명령만 , 깊이 관여(x)
    }
    * */

    //주문 정보 생성
    public Order createOrder(Long id) {
        Member member = memberRepository.findById(id);
        return new Order(id, "상품1", 5000);
    }

}//end class

