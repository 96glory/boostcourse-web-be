package kr.or.connect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("초기화 완료");

        UserBean userBean = (UserBean) ac.getBean("userBean");
        userBean.setName("glory");

        System.out.println(userBean.getName());

        UserBean userBean2 = (UserBean) ac.getBean("userBean");

        if(userBean == userBean2){
            // singleton 이다!
            System.out.println("같은 인스턴스입니다.");
        }
    }
}
