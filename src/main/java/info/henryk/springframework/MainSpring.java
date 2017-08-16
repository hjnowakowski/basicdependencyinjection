package info.henryk.springframework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeClass contextBean = context.getBean("someClass", SomeClass.class);

        System.out.println(contextBean.getUser().getName());

    }
}