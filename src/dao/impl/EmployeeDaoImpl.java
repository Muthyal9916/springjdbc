package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import dao.EmployeeDao;
import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void createEmployee(Employee employee) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = datasource.getConnection();
			String sql="insert into employee(employee,email,gender,salary) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, employee.getEmployeeName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getGender());
			ps.setDouble(4, employee.getSalary());
			
			int rows = ps.executeUpdate();
			if(rows > 0) 
			System.out.println("Employee is created,,.");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		
	}

	@Override
	public Employee getEmployeeId(int empployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int empployeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getallEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
