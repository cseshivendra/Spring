package com.mvcemp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
		
		@RequestMapping("/empDetails")
		public String empDetails(HttpServletRequest request, HttpServletResponse response, Model m) {
			
			String name= request.getParameter("name");
			String password = request.getParameter("password");
			int id = 1;
			String designation = "Developer";
			String dept="IBGT";
			
			if(password.equalsIgnoreCase("admin")) {
				m.addAttribute("empId",id);
				m.addAttribute("name",name);
				m.addAttribute("designation",designation);
				m.addAttribute("dept",dept);
				
				return "employeepage";

			}
			else {
				String message="Invalid credentials! Please try again.";
				m.addAttribute("message",message);
				return "errorpage";
			}
			
		}
		
		
	

}
