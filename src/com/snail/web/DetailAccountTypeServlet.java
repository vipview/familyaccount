package com.snail.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.snail.entity.AccountSubType;
import com.snail.service.GetAccountType;

/**
 * Servlet implementation class DetailAccountTypeServlet
 */
@WebServlet("/DetailAccountTypeServlet")
public class DetailAccountTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("id");
		GetAccountType accountType = new GetAccountType();
		AccountSubType subType = accountType.getAccountSubType(Integer.parseInt(parameter));
		request.setAttribute("detail", subType);
		request.getRequestDispatcher("/item/detail.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
