package info.henryk.springframework;


import info.henryk.springframework.domain.User;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");


        UsersRepositoryImpl usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
        User janek = usersRepository.createUser("Janek");
        System.out.println("Użytkownik " + janek.getName() +  " został utworzony");
        usersRepository.createUser("Henio 😎");



    }
}