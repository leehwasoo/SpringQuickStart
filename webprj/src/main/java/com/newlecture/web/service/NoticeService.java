package com.newlecture.web.service;

import java.sql.SQLException;
import java.util.List;

import com.newlecture.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList(int i, String string, String string2)throws ClassNotFoundException, SQLException;
	// Scalar 
	int getCount() throws ClassNotFoundException, SQLException;

	public int insert(Notice notice) throws SQLException, ClassNotFoundException;
	
	public int update(Notice notice) throws SQLException, ClassNotFoundException;
	
	public int delete(int id) throws ClassNotFoundException, SQLException;
}
