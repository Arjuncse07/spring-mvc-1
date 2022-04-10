package net.javaguides.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springmvc.dao.EmployeeDAO;
import net.javaguides.springmvc.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
		
	@Override
	
	public List<Employee> getEmployees() {
		// TODO Auto-generated method st\
		return employeeDAO.getEmployees();
	}

	@Override
	
	public void saveEmployee(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);

	}

	@Override
	
	public Employee getEmployee(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(theId);
	}

	@Override
	
	public void deleteEmployee(int theId) {
	employeeDAO.deleteEmployee(theId);

	}

}
