package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("usersRepository")
public class UsersRepositoryImpl implements info.henryk.springframework.api.UsersRepository {

    @Autowired(required = false)
    //@Qualifier("withDateLoggerAnnotationQualifier")
    private Logger logger;


    @Value("${database.host}")
    private String host;
    @Value("${database.port}")
    private int port;
    @Value("${database.name}")
    private String database;

    @Value("#{systemProperties['database.user']}")
    private String user;

    @Value("#{systemProperties['database.password']}")
    private String password;

    public User createUser(String name) {
        if (logger != null) {
            logger.log("Tworzenie użytkownika " + name + " do bazy " + host + ":" + port + "/" + database + " korzystająz z użytkownika " + user + " i hasła: " + password);
        }
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
