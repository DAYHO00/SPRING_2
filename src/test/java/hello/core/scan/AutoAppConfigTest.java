package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AutoAppConfigTest {

    @Test
    void BasicScan(){

        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);

        org.assertj.core.api.Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
        for(String name : ac.getBeanDefinitionNames()){

            if(!name.startsWith("org.")){

                System.out.println("name = " + name);
            }
        }
    }

}