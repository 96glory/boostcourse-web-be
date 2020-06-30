package kr.or.connect.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine v8;

    public Car(){
        System.out.println("Car 생성자");
    }

    // @Autowired 추가 시 삭제해도 됨.
    public void setEngine(Engine e){
        this.v8 = e;
    }

    public void run(){
        System.out.println("엔진을 이용하여 달립니다.");
        v8.exec();
    }

//    public static void main(String[] args) {
//        Engine e = new Engine();
//        Car c = new Car();
//
//        c.setEngine(e);
//        c.run();
//    }
}
