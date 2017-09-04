package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UsersRepository;
import info.henryk.springframework.implementations.UsersRepositoryImpl;
import info.henryk.springframework.implementations.WithDataLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = "info.henryk.springframework.implementations")
@Import({LoggersConfiguration.class, RepositoriesConfiguration.class})
public class AppConfiguration {



//    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
//    public SomeBean someBean(){
//        return new SomeBean();
//    }
}
