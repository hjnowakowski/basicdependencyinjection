package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UsersRepository")
public class UsersRepositoryImpl implements info.henryk.springframework.api.UsersRepository {

    private Logger counterLogger;

    public User createUser(String name) {
        counterLogger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

    @Resource
    public void setLogger(Logger logger) {
        this.counterLogger = logger;
    }
}
