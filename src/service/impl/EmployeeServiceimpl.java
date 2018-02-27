package service.impl;

import java.util.List;

import dao.EmployeeDao;
import model.Employee;
import service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService{
	
	private EmployeeDao  employeeDao;
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
		
	}

	@Override
	public Employee fetchEmployeeId(int empployeeId) {
		return employeeDao.getEmployeeId(empployeeId);
	}

	@Override
	public void deleteEmployeeById(int empployeeId) {
		employeeDao.deleteEmployeeById(empployeeId);
		
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		employeeDao.updateEmployeeEmailById(newEmail, employeeId);
		
	}

	@Override
	public List<Employee> getallEmployeeInfo() {
		return employeeDao.getallEmployeeDetails();
	}

}
