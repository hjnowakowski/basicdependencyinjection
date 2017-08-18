package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//("UsersRepository")
public class UsersRepositoryImpl implements info.henryk.springframework.api.UsersRepository {

    @Autowired
    private Logger logger;

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
