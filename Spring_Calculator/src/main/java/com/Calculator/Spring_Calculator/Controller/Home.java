package com.Calculator.Spring_Calculator.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Home {
	
	
	
	@RequestMapping("home")
	public String home()
	{
		
		
		return "Home.jsp";
	}
	@RequestMapping("Addition")
	public String add(@RequestParam("num1") String num1,HttpSession session)
	{
		// num1 = num1.replaceAll("[\"'\\s]+", "").trim();
		 
		
		List<Integer> numbersList = Arrays.stream(num1.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
		int res=0;
		
		for(int i=0;i<numbersList.size();i++)
		{
			res=res+numbersList.get(i);
		}

		session.setAttribute("Name", "Addition of    :   ");
		session.setAttribute("List", numbersList);
		session.setAttribute("value", "Sum of list of values is     :   ");
		session.setAttribute("Result", res);

		return "Caculator.jsp" ;
		
		
	}
	@RequestMapping("Multiplication")
	public String multiplication(@RequestParam("num1")String num1,HttpSession session)
	{
		List<Integer> list=Arrays.stream(num1.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		int res=1;
		for(int i=0;i<list.size();i++)
		{
			res=res*list.get(i);
		}
		session.setAttribute("Name", "Multiplication of    :   ");
		session.setAttribute("List", list);
		session.setAttribute("value", "Multiplication  of list of values is     :   ");
		session.setAttribute("Result", res);
		
		return "Caculator.jsp";
	}
	@RequestMapping("Division")
	public String division(String num1,HttpSession session)
	{
		List<Integer> list=Arrays.stream(num1.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		int res=list.get(0)/list.get(1);
		session.setAttribute("Name","Division of  : ");
		session.setAttribute("List", list);
		session.setAttribute("value", "Division of above two intgers are ");
		session.setAttribute("Result", res);
		return "Caculator.jsp";
	} 
	@RequestMapping
	public String subtracton(String num1,HttpSession session)
	{
		List<Integer> list=Arrays.stream(num1.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		int res=list.get(0)-list.get(1);
		session.setAttribute("Name","Subtraction of : ");
		session.setAttribute("List", list);
		session.setAttribute("value","Subtraction of above two values");
		session.setAttribute("Result", res);
		return "Caculator.jsp";
	}
	
	

}
