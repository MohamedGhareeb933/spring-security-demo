package spring.security.spring.boot.security.tut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.spring.boot.security.tut.entity.Role;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAllRolesByUsersUserName(String userName);
}