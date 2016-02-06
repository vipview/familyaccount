package com.snail.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.snail.entity.AccountSubType;
import com.snail.entity.AccountSuperType;
import com.snail.service.GetAccountType;

/**
 * Servlet implementation class ListAccountTypeServlet
 */
@WebServlet("/ListAccountTypeServlet")
public class ListAccountTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用服务层里面的方法,得到账单类型的全部数据
		GetAccountType  accountType = new GetAccountType();
		List<AccountSubType> limitAccountSubType = accountType.getLimitAccountSubType(0, 1);
		request.setAttribute("limitAcconut", limitAccountSubType);
		request.getRequestDispatcher("/item/list.jsp").forward(request, response);
		
		
		//通过请求转发把数据传给jsp页面
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
