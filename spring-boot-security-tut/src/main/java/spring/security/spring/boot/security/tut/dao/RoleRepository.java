package spring.security.spring.boot.security.tut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.spring.boot.security.tut.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    //Optional<Role> findByRoleName(String roleName);
}