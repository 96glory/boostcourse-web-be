package kr.or.connect.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // ApplicationContext가 IoC 컨테이너가 된다.
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // ApplicationContext가 관리하는 cs.class 타입의 객체를 요청
        CalculatorService cs = ac.getBean(CalculatorService.class);

        // ApplicationContext로부터 받은 객체를 이용하여 덧셈을 구한다.
        System.out.println(cs.plus(10, 50));
    }

}