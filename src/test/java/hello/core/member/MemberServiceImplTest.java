package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L,"MemberA",Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());

        //when

        assertThat(findMember).isEqualTo(member);

        //then
    }
}