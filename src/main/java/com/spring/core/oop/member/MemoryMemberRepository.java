package com.spring.core.oop.member;

//책임: 회원의 정보를 메모리공간에 저장하고 조회할 수 있다.
///어디어 어떻게 저장 ///구체적
public class MemoryMemberRepository implements MemberRepository{

    @Override
    public boolean save(Member member) {
        System.out.println("메모리에 " + member + " 저장함!");
        return false;
    }

    @Override
    public Member findById(Long id) {
        System.out.println("메모리에서 " + id + "번 회원 조회함!");
        return null;
    }


}//end class
