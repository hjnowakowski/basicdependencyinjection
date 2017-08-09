package info.henryk.springframework;

import info.henryk.springframework.api.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        // Load config file (context.xml)
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserRepository usersRepository = context.getBean("repoUzytkownikow", UserRepository.class);

        usersRepository.createUser("Janek");

    }
}
