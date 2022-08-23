package com.example.data_tables.web;

import com.example.data_tables.Entities.CopyUser;
import com.example.data_tables.Entities.CopyUsersBindingModel;
import com.example.data_tables.Entities.User;
import com.example.data_tables.Repositories.CopyUsersRepository;
import com.example.data_tables.Repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class UsersRestController {

    private UserRepository userRepository;
    private CopyUsersRepository copyUsersRepository;

    public UsersRestController(UserRepository userRepository, CopyUsersRepository copyUsersRepository) {
        this.userRepository = userRepository;
        this.copyUsersRepository = copyUsersRepository;
    }

    @PostMapping("/users/add")
    public ResponseEntity<CopyUsersBindingModel> addUser(@RequestBody CopyUsersBindingModel users){

        List<CopyUser> listUsers = users.getUsers();
        listUsers.forEach(u -> {
            u.setDataOfCopy(LocalDate.now());
            copyUsersRepository.save(u);
        });
        return ResponseEntity.ok(users);
    }
}
