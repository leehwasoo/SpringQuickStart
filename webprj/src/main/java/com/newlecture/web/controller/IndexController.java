package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{
	
	@RequestMapping("/index")
	public void request()
	{
		
	}
	
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * ModelAndView mv = new ModelAndView("root.index");
	 * 
	 * //mv.setViewName("WEB-INF/view/index.jsp"); return mv; }
	 */

}
