package spring.security.spring.boot.security.tut.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.security.spring.boot.security.tut.entity.MyUser;

@RestController
public class HomeResource {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/")
    public String home() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        UserDetails user =  userDetailsService.loadUserByUsername("ghareeb");

        String encoded = encoder.encode("ghareeb");

        String password = user.getPassword();
        String userName = user.getUsername();

        boolean pass = encoder.encode("ghareeb").matches(password);


        return "\n" + userName + "\n" + password + "\n" + pass + "\n" + encoded;
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1> welcome user </h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1> welcome admin </h1>");
    }
}
