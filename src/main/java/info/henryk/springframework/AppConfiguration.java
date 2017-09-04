package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UsersRepository;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import info.henryk.springframework.implementations.WithDataLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Logger logger(){
        return new WithDataLogger();
    }

    @Bean
    public UsersRepository usersRepository(){
        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger());
        return usersRepository;
    }
}
