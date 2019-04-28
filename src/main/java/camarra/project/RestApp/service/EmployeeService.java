package camarra.project.RestApp.service;

import java.util.List;

import camarra.project.RestApp.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee employee);

	public void deleteById(int theId);

}
