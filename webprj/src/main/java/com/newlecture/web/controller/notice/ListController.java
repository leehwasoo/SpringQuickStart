package com.newlecture.web.controller.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.service.NoticeService;

@Controller
public class ListController{

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/list")
	public void request() 
	{
		
	}
	
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception { // TODO Auto-generated
	 * method stub ModelAndView mv = new ModelAndView("notice.list");
	 * 
	 * List<Notice> list= noticeService.getList(1, "title", "");
	 * mv.addObject("list", list);
	 * //mv.setViewName("/WEB-INF/view/notice/index.jsp");
	 * 
	 * return mv; }
	 */

}
