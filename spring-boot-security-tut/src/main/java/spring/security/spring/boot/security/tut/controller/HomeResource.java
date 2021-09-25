package spring.security.spring.boot.security.tut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/user")
    public String user() {
        return "welcome user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }
}
