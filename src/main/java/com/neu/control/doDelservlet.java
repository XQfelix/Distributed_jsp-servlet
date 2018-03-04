package com.neu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.service.IstudentService;
import com.neu.service.StudentServiceImpl;

@WebServlet("/doDel")
public class doDelservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取需要删除的数据的id
		int id = Integer.parseInt(request.getParameter("id"));
		//执行删除语句
		IstudentService service = new StudentServiceImpl();
		service.del(id);
		//将页面重定向到index首页
		response.sendRedirect("index");
	}
}
