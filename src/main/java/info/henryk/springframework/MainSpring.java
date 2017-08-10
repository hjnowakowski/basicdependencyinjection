package info.henryk.springframework;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        User user = context.getBean("someUser", User.class);
        System.out.println(user);


    }

}
