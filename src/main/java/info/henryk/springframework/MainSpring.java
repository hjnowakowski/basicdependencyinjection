package info.henryk.springframework;

import info.henryk.springframework.api.UserRepository;
import info.henryk.springframework.implementations.SomeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeBean bean = context.getBean("someBean", SomeBean.class);

    }
}
