package com.Personal.user.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

		
@RequestMapping("/details")	
public String getInfo()
{
  return "Name : Shubham Rajput ,"+ "  Email : rajputshubham93029@gmail.com ,Phone: 9302931428";	
}








@RequestMapping("/")
public String show()
{
return "Welcome to Demo Springboot project. ";
}
	
}
