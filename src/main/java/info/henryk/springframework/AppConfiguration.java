package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UsersRepository;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import info.henryk.springframework.implementations.WithDataLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "info.henryk.springframework.implementations")
public class AppConfiguration {
//    @Bean
//    public Logger logger(){
//        return new WithDataLogger();
//    }
//
//    @Bean
//    public UsersRepository usersRepository(){
//        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//        usersRepository.setLogger(logger());
//        return usersRepository;
//    }
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public SomeBean someBean(){
        return new SomeBean();
    }
}
