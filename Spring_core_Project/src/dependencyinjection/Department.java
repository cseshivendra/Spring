package dependencyinjection;

public class Department {
		public void displayDepartment(String empType) {
			if(empType.equals("HR")) {
				System.out.println("Human Resources");
			}
			else if(empType.equals("Admin")){
				System.out.println("Admin Operations");
			}
			else if(empType.equals("Technology")) {
				System.out.println("Research & Development");
			}
				
		}
}

