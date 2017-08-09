package info.henryk.springframework;

import info.henryk.springframework.api.Logger;
import info.henryk.springframework.api.UserRepository;
import info.henryk.springframework.domain.User;
import info.henryk.springframework.implementations.LoggerImpl;
import info.henryk.springframework.implementations.UsersRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UserRepository userRepository = new UsersRepositoryImpl();
        userRepository.setLogger(logger);

        User janek = userRepository.createUser("Janek");



    }
}
