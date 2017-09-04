package info.henryk.springframework.api;

import info.henryk.springframework.domain.User;

public interface UsersRepository {
    User createUser(String name);
    void setLogger(Logger logger);
}
