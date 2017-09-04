package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UsersRepository;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoriesConfiguration {
    @Autowired
    private Logger logger;

    @Autowired
    private LoggersConfiguration loggersConfiguration;

    @Bean
    public UsersRepository usersRepository(){
        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
        //usersRepository.setLogger(logger);
        usersRepository.setLogger(loggersConfiguration.logger());
        return usersRepository;
    }
}
