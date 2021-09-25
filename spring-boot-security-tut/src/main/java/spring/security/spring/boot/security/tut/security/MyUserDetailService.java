package spring.security.spring.boot.security.tut.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring.security.spring.boot.security.tut.dao.UserRepository;
import spring.security.spring.boot.security.tut.entity.MyUser;

import java.util.Optional;

@Service
public class MyUserDetailService  implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<MyUser> user =  userRepository.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found"));

        return user.map(MyUserDetails::new).get();
    }
}
