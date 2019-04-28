package camarra.project.RestApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import camarra.project.RestApp.employeeDAO.EmployeeRepository;
import camarra.project.RestApp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	public Employee findById(int theId) {
		Optional<Employee> result = repository.findById(theId);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {

			throw new RuntimeException("Did not find employee id- " + theId);
		}
		return theEmployee;
	}

	@Override
	public void save(Employee employee) {

		repository.save(employee);
	}

	@Override
	public void deleteById(int theId) {
		repository.deleteById(theId);
	}
}
