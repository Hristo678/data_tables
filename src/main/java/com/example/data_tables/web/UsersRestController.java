package com.example.data_tables.web;

import com.example.data_tables.Entities.CopyUser;
import com.example.data_tables.Entities.CopyUsersBindingModel;
import com.example.data_tables.Entities.User;
import com.example.data_tables.Repositories.CopyUsersRepository;
import com.example.data_tables.Repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class UsersRestController {

    private UserRepository userRepository;
    private CopyUsersRepository copyUsersRepository;

    public UsersRestController(UserRepository userRepository, CopyUsersRepository copyUsersRepository) {
        this.userRepository = userRepository;
        this.copyUsersRepository = copyUsersRepository;
    }

    @GetMapping
    public String test(){
        return "index";
    }
    String test = "test";
//    @PostMapping("/users/add")
//    public String addUser(@RequestParam(value = "selected") String selected){
//        System.out.println();
//
////        listUsers.forEach(u -> {
////            u.setDataOfCopy(LocalDate.now());
////            copyUsersRepository.save(u);
////        });
//
//        System.out.println("Invo");
//
//        return "redirect:/";
//    }

//    @ModelAttribute
//    public CopyUsersBindingModel copyUsersBindingModel() {
//        return new CopyUsersBindingModel();
//    }
}
