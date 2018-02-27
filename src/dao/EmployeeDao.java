package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {

	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeId(int empployeeId);
	public abstract void deleteEmployeeById(int empployeeId);
	public abstract void updateEmployeeEmailById(String newEmail,int employeeId);
	public abstract List<Employee> getallEmployeeDetails();
}
