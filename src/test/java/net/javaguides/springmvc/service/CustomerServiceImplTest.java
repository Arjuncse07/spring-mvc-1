package net.javaguides.springmvc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import net.javaguides.springmvc.dao.CustomerDAO;
import net.javaguides.springmvc.entity.Customer;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {

	@Mock
	CustomerDAO customerDAO;

	@InjectMocks
	CustomerServiceImpl customerServiceImpl;

	@Test
	public void getCustomerTest() {

		// Given
		Customer customer = new Customer();
		customer.setFirstName("Amit");

		// When
		when(customerDAO.getCustomer(1)).thenReturn(customer);

		// Then
		Customer expectedResponse = customerServiceImpl.getCustomer(1);

		assertNotNull(expectedResponse);
		assertEquals(expectedResponse.getFirstName(), "Amit");

	}

	@Test
	public void saveCustomer() throws Exception {

		// Given
		Customer customer = new Customer();
		customer.setFirstName("Sumit");
		customer.setLastName("Kumar");
		customer.setEmail("sumti232@rediffmail.com");
		customer.setAddress("NDLS");

		// when

	}

}
