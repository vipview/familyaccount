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
import com.snail.entity.IncomeToExpensesType;
import com.snail.service.GetAccountType;

/**
 * Servlet implementation class EditAccountTypeServlet
 */
@WebServlet("/EditAccountTypeServlet")
public class EditAccountTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//先查出对应项的数据
		String parameter = request.getParameter("id");
		
		GetAccountType accountType = new GetAccountType();
		
		AccountSubType subType = accountType.getAccountSubType(Integer.parseInt(parameter));
		request.setAttribute("subtype", subType);
		
		List<AccountSuperType> superType = accountType.getAllAccountSuperType();
		request.setAttribute("allSuperType", superType);
		
		List<IncomeToExpensesType> allIncomeToExpensesType = accountType.getAllIncomeToExpensesType();
		request.setAttribute("allIncomeToExpense", allIncomeToExpensesType);
		
		request.getRequestDispatcher("/item/edit.jsp").forward(request, response);
		
		
		
		//然后查询所有的收支类型
		//然后查询所有的父类型
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
