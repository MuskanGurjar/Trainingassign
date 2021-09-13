package com.hsbc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.web.service.EmpJsonService;


@WebServlet("/vaccinejson")
public class JsonAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String vaccinename = request.getParameter("name");

		if (!vaccinename.equals("")) {
			
			if (request.getHeader("Accept").equals("application/json")) {

				EmpJsonService service = new EmpJsonService();
				String result = service.getJson(vaccinename);

				response.getWriter().write(result);
			} else {
				response.sendError(406, "This application supports JSON Only");
			}

		} else {
			response.getWriter().write("No Id provided..");
		}

	}

}