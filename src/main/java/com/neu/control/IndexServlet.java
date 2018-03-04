package com.neu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.service.IstudentService;
import com.neu.service.StudentServiceImpl;

import bean.Student;

@WebServlet("/index")
public class IndexServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��ȡ���ݿ���Ϣ 
		IstudentService service = new StudentServiceImpl();
		List<Student> students = service.getStudents();
		//�����ݿ���Ϣ��ʾ��ҳ����
		request.setAttribute("student", students);
		//��ҳ��ת����index.jsp
		request.getRequestDispatcher("WEB-INF/pages/index.jsp").forward(request, response);
	}
}
