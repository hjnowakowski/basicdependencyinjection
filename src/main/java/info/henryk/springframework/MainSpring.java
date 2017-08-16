package info.henryk.springframework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Application application = context.getBean("application", Application.class);
        System.out.println(application.getDictionaryRepository().getMapValue());
        System.out.println(application.getUsersRepository().exists("janek"));


    }
}