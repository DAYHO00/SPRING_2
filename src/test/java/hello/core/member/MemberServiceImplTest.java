package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    @DisplayName("회원가입")
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