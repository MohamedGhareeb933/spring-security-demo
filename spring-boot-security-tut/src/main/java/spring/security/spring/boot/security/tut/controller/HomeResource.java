package spring.security.spring.boot.security.tut.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/")
    public String home() {
        return "welcome";
    }

    @GetMapping("/user")
    public String user() {
        return "welcome user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }
}
