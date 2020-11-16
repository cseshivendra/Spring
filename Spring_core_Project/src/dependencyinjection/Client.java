package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.displayEmployeeInfo();
	} 

}
