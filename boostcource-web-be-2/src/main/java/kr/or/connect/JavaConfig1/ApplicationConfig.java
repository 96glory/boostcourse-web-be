package kr.or.connect.JavaConfig1;

import kr.or.connect.DI.Car;
import kr.or.connect.DI.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// ApplicationConfig2.java를 위해 잠시 주석 처리 함.
//@Configuration
public class ApplicationConfig {

    @Bean
    public Car car(Engine e){
        Car c = new Car();
        c.setEngine(e);
        return c;
    }

    @Bean
    public Engine engine(){
        return new Engine();
    }
}
