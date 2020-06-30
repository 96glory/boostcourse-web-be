package kr.or.connect.JavaConfig1;

import kr.or.connect.DI.Car;
import kr.or.connect.JavaConfig1.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Car car = (Car) ac.getBean("Car");
        Car car = (Car) ac.getBean(Car.class);
        car.run();
    }
}
