package info.henryk.springframework.api;

import info.henryk.springframework.domain.User;

public interface UsersRepository {
    //private Logger logger;
    public User createUser(String name);
    public void setLogger(Logger logger);
}
