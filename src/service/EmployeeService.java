package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmployeeId(int empployeeId);
	public abstract void deleteEmployeeById(int empployeeId);
	public abstract void updateEmployeeEmailById(String newEmail,int employeeId);
	public abstract List<Employee> getallEmployeeInfo();
}
