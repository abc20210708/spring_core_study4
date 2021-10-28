package com.spring.core.oop.order;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private Long memberId; //주문한 회원 식별번호
    private String itemName; //주문 상품명
    public int itemPrice; //주문 상품 금액



}//end class
