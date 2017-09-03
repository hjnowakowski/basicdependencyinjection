package info.henryk.springframework;


import info.henryk.springframework.implementations.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");


        UsersRepositoryImpl usersRepository = context.getBean("UsersRepository", UsersRepositoryImpl.class);
        usersRepository.createUser("Janek");
        usersRepository.createUser("Henio 😎");



    }
}