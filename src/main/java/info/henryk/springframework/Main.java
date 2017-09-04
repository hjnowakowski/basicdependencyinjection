package info.henryk.springframework;


import info.henryk.springframework.api.UsersRepository;
import info.henryk.springframework.domain.User;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
        usersRepository.createUser("Janek");
    }
}