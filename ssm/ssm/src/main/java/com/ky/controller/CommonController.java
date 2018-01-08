package com.ky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ky.service.IUserService;

@Controller
@RequestMapping("/pc")
public class CommonController {
	
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping("/showUser")
	public ModelAndView showUser(String userId){
		ModelAndView modelAndView=new ModelAndView("/showUser");
		modelAndView.addObject("user", iUserService.getUserById(Integer.valueOf(userId)));
		return modelAndView;
	}
	
	@RequestMapping("/index")
	public String toIndex(String userId){
		return "/index";
	}

}
