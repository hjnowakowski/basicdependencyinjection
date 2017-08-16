package info.henryk.springframework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //User user = context.getBean("user2", User.class);

        //System.out.println(user);

        SomeBean bean = context.getBean("someBean", SomeBean.class);
        System.out.println(bean.getIntegersList());
        System.out.println(bean.getStringList());
        System.out.println(Arrays.toString(bean.getLongArray()));

    }
}