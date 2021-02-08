package rest.springboot2.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rest.springboot2.jpa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
