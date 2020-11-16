package com.sal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaryController {
	

	@RequestMapping("/salary/{id1}")
	public String helloWorld(
	@RequestParam ("id") int id,
	@RequestParam ("name") String name,
	@RequestParam ("basic") int basic,
	@RequestParam ("hra") int hra,
	@RequestParam ("da") int da,
	@RequestParam ("deductions") int deductions,
	@PathVariable("id1") int id1,
	Model m) {
	int gross_salary = basic+hra+da+deductions;
	int net_salary = gross_salary - (deductions);
	String message = "ID : " + id + "Name : "+ name + "Salary : " + net_salary;
	m.addAttribute("message", message);
	return "salary";
	}

}
