package com.neu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.service.IstudentService;
import com.neu.service.StudentServiceImpl;

import bean.Student;


@WebServlet("/goUpdate")
public class GoUpdateservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取需要修改的id的值
		int id = Integer.parseInt(request.getParameter("id"));
		//根据id值查询所要修改的数据的值
		IstudentService service = new StudentServiceImpl();
		Student student = service.getStudentById(id);
		//将数据放入作用域
		request.setAttribute("stu", student);
		//将页面转发到修改的页面

		request.getRequestDispatcher("WEB-INF/pages/update.jsp").forward(request, response);
	}
	
}
