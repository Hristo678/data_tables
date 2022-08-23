package com.example.data_tables.Services;

import com.example.data_tables.Entities.User;
import com.example.data_tables.Repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;

    public DBInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll().size() <5){

        userRepository.save(new User("Peter", 20, "gosho@abv.bg"));
        userRepository.save(new User("Vladi", 40, "pesho@abv.bg"));
        userRepository.save(new User("Georgi", 30, "mariika@abv.bg"));
        userRepository.save(new User("Mitko", 30, "some@abv.bg"));
        userRepository.save(new User("Kristina", 25, "other@abv.bg"));
        userRepository.save(new User("Polina", 30, "kiro@abv.bg"));
        userRepository.save(new User("Rado", 60, "peso@abv.bg"));
        userRepository.save(new User("Ceco", 30, "something@abv.bg"));
        userRepository.save(new User("Ico", 50, "mariika@abv.bg"));
        }
    }
}
