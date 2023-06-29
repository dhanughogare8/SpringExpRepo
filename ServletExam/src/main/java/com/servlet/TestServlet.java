package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daos.AlienDao;
import com.pojos.Alien;
import com.pojos.Student;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Student student = new Student(101,"ABC");

//		List<Student>students = Arrays.asList(new Student(101,"ABC"),new Student(102,"PQR"),new Student(103,"XYZ"));
//		
//		req.setAttribute("student", students);
//		
		RequestDispatcher  rd= req.getRequestDispatcher("JSTLDemo.jsp");
		rd.forward(req, resp);

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
//		int result = num1+num2;
//		
		PrintWriter pw = resp.getWriter();
		pw.print("Welcome " + name + " " + id);
		
//		AlienDao dao= new AlienDao();
//		
//		Alien alien = dao.getAlien(id);
//		
//		req.setAttribute("alien", alien);
//		RequestDispatcher rd = req.getRequestDispatcher("ShowData.jsp");
//		rd.forward(req, resp);
		
		

	}
}
