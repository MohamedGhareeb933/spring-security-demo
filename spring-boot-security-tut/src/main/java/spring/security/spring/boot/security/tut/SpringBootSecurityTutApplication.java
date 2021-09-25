package spring.security.spring.boot.security.tut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import spring.security.spring.boot.security.tut.dao.CustomerRepository;
import spring.security.spring.boot.security.tut.dao.RoleRepository;
import spring.security.spring.boot.security.tut.dao.UserRepository;

@SpringBootApplication
public class SpringBootSecurityTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityTutApplication.class, args);
	}

}
