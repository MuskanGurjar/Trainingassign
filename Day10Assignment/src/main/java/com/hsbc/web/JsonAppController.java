package com.hsbc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.web.service.BookJsonService;


@WebServlet("/bookjson")
public class JsonAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=0;
		String empid=request.getParameter("id");
		if(!empid.equals("")) {
			id=Integer.parseInt(empid);
			BookJsonService empjson=new BookJsonService();
			String result =empjson.getJson(id);
			response.getWriter().write(result);
		}
		else {
			response.getWriter().write("No id given...");
		}
	}

}
