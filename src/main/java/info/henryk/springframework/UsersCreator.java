package info.henryk.springframework;

import java.util.logging.Logger;

public class UsersCreator {

    Logger logger = Logger.getLogger(this.getClass().getName());

    public User createUser(String UserName){
        logger.info("Tworzenie użytkownika: " + UserName);
        User user = new User();
        user.setName(UserName);
        return user;

    }
}
