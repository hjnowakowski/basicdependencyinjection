package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public class UsersRepositoryImpl implements info.henryk.springframework.api.UsersRepository {
    private Logger logger;


    public User createUser(String name) {
        if (logger != null) {
            logger.log("Tworzenie użytkownika " + name);
        }
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
