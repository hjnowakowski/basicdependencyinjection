package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.implementations.WithDataLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggersConfiguration {
    @Bean
    public Logger logger(){
        return new WithDataLogger();
    }

}
