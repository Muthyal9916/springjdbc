package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
import service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		
			/*create table employee_table(
				'employee_id' int(11) not null auto_increment,
				'employee_name' varchar(45) not null,
				'salary' double default null,
				'email' varchar(45) default null,
				'gender' varchar(45) default null,
				primary key ('employee_id')
				);*/
		
		
		

		AbstractApplicationContext apc = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService service =  apc.getBean("employeeService", EmployeeService.class);
		
		Employee emp = new Employee();
		emp.setEmail("muthuatp.k@gmail.com");
		emp.setEmployeeName("muthu");
		emp.setGender("Male");
		emp.setSalary(90000);
		
		service.addEmployee(emp);
	}

}
