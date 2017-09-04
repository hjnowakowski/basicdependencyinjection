package info.henryk.springframework;


import info.henryk.springframework.domain.User;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.registerShutdownHook();
        context.getBean("someBean");
        context.close();

//        UsersRepositoryImpl usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
//        User janek = usersRepository.createUser("Janek");
//        System.out.println("Użytkownik " + janek.getName() +  " został utworzony");
//        usersRepository.createUser("Henio 😎");



    }
}