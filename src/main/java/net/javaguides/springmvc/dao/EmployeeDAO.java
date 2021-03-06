package net.javaguides.springmvc.dao;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;
import net.javaguides.springmvc.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
	
}
