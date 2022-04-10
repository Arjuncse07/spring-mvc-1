package net.javaguides.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.javaguides.springmvc.entity.Customer;
import net.javaguides.springmvc.entity.Employee;
@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private org.hibernate.SessionFactory sessionFactory;
	
	
	@Override
	public List<Employee> getEmployees() {
		
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb1 = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq1 = cb1.createQuery(Employee.class);
		Root<Employee> root = cq1.from(Employee.class);
		cq1.select(root);
		Query query = session.createQuery(cq1);
		return query.getResultList();
	}

	@Override
	public void saveEmployee(Employee theEmployee) {
		Session currentSession1= sessionFactory.getCurrentSession();
		currentSession1.saveOrUpdate(theEmployee);

	}

	@Override
	public Employee getEmployee(int theId) {
		Session currentSession1 = sessionFactory.getCurrentSession();
		Employee theEmployee = currentSession1.get(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public void deleteEmployee(int id ) {
		Session session1 = sessionFactory.getCurrentSession();
		Employee book = session1.byId(Employee.class).load(id);
		session1.delete(book);

	}

}
