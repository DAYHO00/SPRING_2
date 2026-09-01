package hello.core;

import hello.core.discount.RateDicountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemerRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderSeviceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemerRepository());
    }

    public OrderService orderService(){
        return new OrderSeviceImpl(new MemoryMemerRepository(), new RateDicountPolicy());
    }
}
