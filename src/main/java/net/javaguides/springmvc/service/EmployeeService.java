package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public void saveEmployee(Employee theEmployee);
	
	public Employee getEmployee(int theId);
	
	public void deleteEmployee(int theId);
	
	
}
