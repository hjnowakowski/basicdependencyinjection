package info.henryk.springframework.api;

import info.henryk.springframework.domain.User;


public interface UserRepository {
    User createUser(String name);
    void setLogger(Logger logger);
}
