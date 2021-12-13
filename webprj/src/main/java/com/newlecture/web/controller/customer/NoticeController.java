package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController{

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list() throws ClassNotFoundException, SQLException 
	{
		List<Notice> list= noticeService.getList(1, "title", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail()
	{
		return "notice.list";
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
