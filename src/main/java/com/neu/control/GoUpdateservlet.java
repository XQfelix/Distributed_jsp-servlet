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
		//��ȡ��Ҫ�޸ĵ�id��ֵ
		int id = Integer.parseInt(request.getParameter("id"));
		//����idֵ��ѯ��Ҫ�޸ĵ����ݵ�ֵ
		IstudentService service = new StudentServiceImpl();
		Student student = service.getStudentById(id);
		//�����ݷ���������
		request.setAttribute("stu", student);
		//��ҳ��ת�����޸ĵ�ҳ��

		request.getRequestDispatcher("WEB-INF/pages/update.jsp").forward(request, response);
	}
	
}
