package spring.security.spring.boot.security.tut.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring.security.spring.boot.security.tut.dao.RoleRepository;
import spring.security.spring.boot.security.tut.dao.UserRepository;
import spring.security.spring.boot.security.tut.entity.Role;
import spring.security.spring.boot.security.tut.entity.User;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailService  implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findByUserName(userName);

        List<Role> roles = roleRepository.findAllRolesByUsersUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found"));

        return new MyUserDetails(user.get(), roles);
    }
}
