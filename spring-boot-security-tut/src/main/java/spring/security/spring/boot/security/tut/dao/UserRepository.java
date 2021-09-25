package spring.security.spring.boot.security.tut.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.spring.boot.security.tut.entity.MyUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByUserName(String userName);
}
