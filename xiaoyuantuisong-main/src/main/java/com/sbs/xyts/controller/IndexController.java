package com.sbs.xyts.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
//	ModelAndView     
//	model	
//	String   逻辑视图名       
//	void
	
	@RequestMapping("/index")
	public String index(){
		return "test";
	}
	
	//	ModelAndView 
	@RequestMapping("/index1")
	public ModelAndView index1(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		mv.addObject("test", "success");
		return mv;
	}
	
	@RequestMapping("/index2")
	public void index2(){
		
	}
	
//	void
	@RequestMapping("/index3")
	public void index3(HttpServletResponse response) throws IOException{
		response.getWriter().append("test");
	}
}
