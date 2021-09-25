package spring.security.spring.boot.security.tut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import spring.security.spring.boot.security.tut.entity.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
