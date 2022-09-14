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
        System.out.println("NotMasterBranch1");
        String first = "tedasdasttt";
        System.out.println("NotMasterBranch1");
        System.out.println("NotMasterBranch1");
        String test = "test";
        char test1 = '1';
        model.addAttribute("users", userRepository.findAll());
        System.out.println("NotMasterBranch");
        System.out.println("NotMasterBranch");
        long testLong1 = 5;

        return "users";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam(value = "name") String[] name){
        System.out.println();
         String seeIfSavesIt= "testIfItsSafe";

        System.out.println("Invo");

        return "redirect:/";
    }

}
