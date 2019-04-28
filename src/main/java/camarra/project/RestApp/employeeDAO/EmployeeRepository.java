package camarra.project.RestApp.employeeDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import camarra.project.RestApp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
