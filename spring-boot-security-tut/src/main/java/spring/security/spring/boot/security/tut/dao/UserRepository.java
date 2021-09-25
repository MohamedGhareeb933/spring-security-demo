package spring.security.spring.boot.security.tut.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.spring.boot.security.tut.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}
