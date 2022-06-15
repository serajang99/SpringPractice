package seowoo.jang.datamarket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seowoo.jang.datamarket.aop.TimeTraceAop;

@Configuration
public class SpringConfig {

    // AOP 같은 경우는 @Component를 쓰지 않고 Bean으로 등록해주는 편이 좋다
    // AOP 하는 애구나를 따로 구분하기 위함.
    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }
}
