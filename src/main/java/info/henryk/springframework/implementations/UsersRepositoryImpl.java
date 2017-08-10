package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UserRepository;
import info.henryk.springframework.domain.User;

public class UsersRepositoryImpl implements UserRepository{
    private Logger logger;


    public UsersRepositoryImpl(Logger logger, String localization) {
        this.logger = logger;
        logger.log("lokalizacja repozytorium" + localization);

    }

    public User createUser(String name){
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }


}
