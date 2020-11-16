package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	public int empId;
	public String name;
	public String dept;
	@Autowired
	public Department department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Department getDepartment() {
		return department;
	}
	
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Employee id: "+empId);
		System.out.println("Employee name: "+name);
		System.out.println("Employee dept: "+dept);
		department.displayDepartment(dept);

	}
	
	
	
	
	
	

}
