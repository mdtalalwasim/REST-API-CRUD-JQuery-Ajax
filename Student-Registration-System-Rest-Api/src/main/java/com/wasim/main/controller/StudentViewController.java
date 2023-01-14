package com.wasim.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/view")
public class StudentViewController {
	
	@RequestMapping("/student")
	public ModelAndView getStudent(HttpServletRequest request, Model model) {
		
		ModelAndView mv = new ModelAndView();
		//model.addAttribute("student","");
		mv.setViewName("student-home");
		return mv;
		
	}

}
