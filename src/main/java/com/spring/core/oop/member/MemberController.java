package com.spring.core.oop.member;

//책임: 적당한 회원 저장소에 저장 및 조회 명령을 내려야 한다.
public class MemberController {
    ///MemberController ///클라이언트
    ///저장소를 부품으로 / Composition
    // /MemberRepository서버
    private MemberRepository memberRepository;
    ///의존객체 없음.

    ////의존객체 생성 제어 - ///외부에서 받아옴
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;

    }

    //회원 가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원 조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


}//end class
