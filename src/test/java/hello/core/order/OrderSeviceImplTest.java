package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderSeviceImplTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderSeviceImpl();


    @Test
    void createOrder() {

        long memberId= 1L;
        Member memeber = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(memeber);

        Order order = orderService.createOrder(memberId,"itemA",1000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}