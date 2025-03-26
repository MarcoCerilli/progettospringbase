package com.example.progettospringbase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class ContattoController {
    private static final String url = "jdbc:mysql://localhost:3306/springbase?serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "Reddino24";
 

    @GetMapping("/about")
    public String AboutPage() {
        return "about";
    }
}

