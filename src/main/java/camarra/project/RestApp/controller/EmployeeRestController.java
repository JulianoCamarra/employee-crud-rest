package camarra.project.RestApp.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import camarra.project.RestApp.entity.Employee;
import camarra.project.RestApp.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return employeeService.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {

		Employee theEmployee = employeeService.findById(employeeId);

		if (theEmployee == null) {
			throw new EmployeeNotFoundException("could not find employee ID- " + employeeId);
		}
		return theEmployee;
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {

		employee.setId(0);
		employeeService.save(employee);

		return employee;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {

		employeeService.save(employee);

		return employee;
	}
	
	@DeleteMapping("/employees/{employeeId")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee tempEmployee=employeeService.findById(employeeId);
		
		if (tempEmployee==null) {
			throw new EmployeeNotFoundException("could not find employee ID- "+employeeId);
		}
		employeeService.deleteById(employeeId);
		
		return "deleted employee id- "+employeeId;
	}

}
