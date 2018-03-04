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

@WebServlet("/doAdd")
public class DoAddservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���մ�ǰ̨input��������Ϣ
				String name = request.getParameter("name");
				int bId = Integer.parseInt(request.getParameter("bId"));
				int gerden = Integer.parseInt(request.getParameter("gerden"));
		//ִ��������
				IstudentService service = new StudentServiceImpl();
				Student student = new Student();
				student.setName(name);
				student.setBId(bId);
				student.setGerden(gerden);
				service.add(student);
		//��ҳ���ض���index.jsp
				response.sendRedirect("index");
	}
}
