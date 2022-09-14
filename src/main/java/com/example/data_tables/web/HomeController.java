package com.example.data_tables.web;

import com.example.data_tables.Repositories.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("users")
    public String home(Model model){
        System.out.println("NotMasterBranch");
        String secondTest4 = "testtt2222";
        System.out.println("NotMasterBranch3");
        System.out.println("NotMasterBranch4");
        System.out.println("NotMasterBranch2");
        System.out.println("NotMasterBranch2");
        String test4 = "test";
        char finalTest = '1';
        char finalTest2 = '1';

        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam(value = "name") String[] name){
        System.out.println();


        System.out.println("Invo");
        String seeIfItsAdded = "testIfAdded it";
        return "redirect:/";
    }

}
