package net.javaguides.springmvc.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import net.javaguides.springmvc.dao.EmployeeDAO;
import net.javaguides.springmvc.entity.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@Mock
	EmployeeDAO employeeDAO;
	
	@InjectMocks
	EmployeeServiceImpl employeeServiceImpl;
	
	@Test
	public void getEmployeeTest() {
		
		Employee employee= new Employee();
		employee.setFirstName("Arjun");
		employee.setLastName("Singh");
		employee.setEid(1);
		employee.setEmail("adfa@gmail.com");
		
		when(employeeDAO.getEmployee(1)).thenReturn(employee);
		
		Employee expectedResponse= employeeServiceImpl.getEmployee(1);
		
		assertNotNull(expectedResponse);
		assertEquals(expectedResponse.getFirstName(), "Arjun");
		assertEquals(expectedResponse.getLastName(), "Singh");
		assertEquals(expectedResponse.getEid(), 1);
		assertEquals(expectedResponse.getEmail(), "adfa@gmail.com");
		
		
	}
	
	@Test
	public void saveEmployee() throws Exception{
		
		Employee employee= new Employee();
		employee.setFirstName("Suman");
		employee.setLastName("kumar");
		employee.setEmail("ss22@gmail.com");
		employee.setEid(1);
		
		doNothing().when(employeeDAO).saveEmployee(employee);
		employeeServiceImpl.saveEmployee(employee);
		
	}
	
	@Test
	public void deleteEmployee() throws Exception{
		
		Employee employee= new Employee();
		employee.setEid(1);
		
		doNothing().when(employeeDAO).deleteEmployee(1);
		employeeServiceImpl.deleteEmployee(1);
	}
	

}
