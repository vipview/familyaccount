/**
 * AccountTypeDao.java
 * com.snail.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月30日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.snail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.snail.entity.AccountSubType;
import com.snail.entity.AccountSuperType;
import com.snail.entity.IncomeToExpensesType;
import com.snail.utils.DBconnection;

/**
 * ClassName:AccountTypeDao<br/>
 * Function: 查询账单的类型<br/>
 * Reason: <br/>
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月30日 下午3:50:24
 *
 * @see
 * 
 */
public class AccountTypeDao {

	public AccountTypeDao() {

	}

	/**
	 * 
	 * getAccountSubTypeDao:(通过ID 查询对应的账单子类型)<br/>
	
	 *
	 * @param  @param sub_bt_id
	 * @param  @return    设定文件
	 * @return AccountSubType    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public AccountSubType getAccountSubTypeDao(int sub_bt_id) {
		Connection conn = DBconnection.getConnection();
		ResultSet query=null;
		PreparedStatement statement=null;
		try {
			String sql = "select * from sub_bill_type where sub_bt_id=?";
			statement = conn.prepareStatement(sql);
			
			statement.setInt(1, sub_bt_id);
			query = statement.executeQuery();
			AccountSubType accountSubType  = new AccountSubType();
			if (query.next()) {
				
				// 得到子类型的ID号
				accountSubType.setAccountSubTypeID(query.getInt("sub_bt_id"));
				// 得到父类型的id然后通过geAccountSuperType方法得到父类型的对象
				int by_id = query.getInt("by_id");
				AccountSuperType accountSuperType = getAccountSuperType(by_id);
				accountSubType.setAccountSuperType(accountSuperType);
				// 得到子类型的名字
				accountSubType.setAccountSubTypeName(query.getString("sub_bt_name"));

				
			}
			return accountSubType;
		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && query != null) {
				try {
					conn.close();
					query.close();
					statement.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}

	}
	
	
	
	
	
	/**
	 * 
	 * getLimitAccountSubTypeDao:(分页查询全部的子类型账单)<br/>
	 *
	 * 
	 * @param page
	 * @param num
	 * @return 设定文件
	 * @return AccountSubType DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<AccountSubType> getLimitAccountSubTypeDao(int page, int num) {
		Connection conn = DBconnection.getConnection();
		ResultSet query=null;
		PreparedStatement statement=null;
		try {
			String sql = "select * from sub_bill_type limit ?,?";
			statement = conn.prepareStatement(sql);
			statement.setInt(1, (num - 1) * page);
			statement.setInt(2, num);
			query = statement.executeQuery();
			List<AccountSubType> list = new ArrayList<>();
			AccountSubType accountSubType = null;
			while (query.next()) {
				accountSubType = new AccountSubType();
				// 得到子类型的ID号
				accountSubType.setAccountSubTypeID(query.getInt("sub_bt_id"));
				// 得到父类型的id然后通过geAccountSuperType方法得到父类型的对象
				int by_id = query.getInt("by_id");
				AccountSuperType accountSuperType = getAccountSuperType(by_id);
				accountSubType.setAccountSuperType(accountSuperType);
				// 得到子类型的名字
				accountSubType.setAccountSubTypeName(query.getString("sub_bt_name"));

				list.add(accountSubType);
			}
			return list;
		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && query != null) {
				try {
					conn.close();
					query.close();
					statement.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}

	}

	/**
	 * 
	 * getAccountSuperType:(获取父类型数据)<br/>
	 *
	 * @param by_id
	 * @return 设定文件
	 * @return AccountSuperType DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public AccountSuperType getAccountSuperType(int by_id) {
		Connection conn = DBconnection.getConnection();
		ResultSet executeQuery = null;
		try {
			Statement createStatement = conn.createStatement();
			String sql = "select * from bill_type where by_id = " + by_id;
			executeQuery = createStatement.executeQuery(sql);
			AccountSuperType accountSuperType = new AccountSuperType();
			if (executeQuery.next()) {

				accountSuperType.setAccountSuperTypeID(executeQuery.getInt("by_id"));
				accountSuperType.setAccountSuperTypeName(executeQuery.getString("by_name"));
				// 查询数据库得到收支类型对象
				int in_ex_id = executeQuery.getInt("in_ex_id");
				IncomeToExpensesType incomeToExpenses = getIncomeToExpenses(in_ex_id);
				accountSuperType.setIncomeToExpensesType(incomeToExpenses);

			}
			return accountSuperType;

		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && executeQuery != null) {
				try {
					conn.close();
					executeQuery.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}

	}

	/**
	 * 
	 * getAllAccountSuperType:(查询全部的父类型的数据,并通过list集合返回)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param  @return    设定文件
	 * @return List<AccountSuperType>    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public List<AccountSuperType> getAllAccountSuperType() {
		Connection conn = DBconnection.getConnection();
		ResultSet executeQuery = null;
		try {
			Statement createStatement = conn.createStatement();
			String sql = "select * from bill_type ;";
			executeQuery = createStatement.executeQuery(sql);
			List<AccountSuperType> list = new ArrayList<>();
			AccountSuperType accountSuperType = null;
			while (executeQuery.next()) {
				accountSuperType = new AccountSuperType();
				accountSuperType.setAccountSuperTypeID(executeQuery.getInt("by_id"));
				accountSuperType.setAccountSuperTypeName(executeQuery.getString("by_name"));
				// 查询数据库得到收支类型对象
				int in_ex_id = executeQuery.getInt("in_ex_id");
				IncomeToExpensesType incomeToExpenses = getIncomeToExpenses(in_ex_id);
				accountSuperType.setIncomeToExpensesType(incomeToExpenses);
				list.add(accountSuperType);
			}
			return list;

		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && executeQuery != null) {
				try {
					conn.close();
					executeQuery.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}

	}
	
	
	
	
	
	
	/**
	 * 
	 * getAllIncomeToExpenses:(查村所有的收支类型,并用list集合返回)<br/>
	 *
	 * @param  @return    设定文件
	 * @return List<IncomeToExpensesType>    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public  List<IncomeToExpensesType> getAllIncomeToExpenses() {
		Connection conn = DBconnection.getConnection();
		ResultSet query = null;
		try {
			Statement statement = conn.createStatement();
			String sql = "select * from income_and_expenses ;";
			query = statement.executeQuery(sql);
			List<IncomeToExpensesType> list = new ArrayList<>();
			IncomeToExpensesType incomeToExpensesType = null;
			while (query.next()) {
				incomeToExpensesType = new IncomeToExpensesType();
				incomeToExpensesType.setIncomeExpenID(query.getInt("in_ex_id"));
				incomeToExpensesType.setIncomeExpenName(query.getString("in_ex_name"));
				list.add(incomeToExpensesType);
			}
			return list;
		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && query != null) {
				try {
					conn.close();
					query.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}
	}
	
	
	
	
	
	
	/**
	 * 
	 * getIncomeToExpenses:(获取数据库里面收支收支类型数据)<br/>
	 *
	 * @param @param
	 *            IncomeToExpensesID
	 * @param @return
	 *            设定文件
	 * @return IncomeToExpensesType DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public  IncomeToExpensesType getIncomeToExpenses(int IncomeToExpensesID) {
		Connection conn = DBconnection.getConnection();
		ResultSet query = null;
		try {
			Statement statement = conn.createStatement();
			String sql = "select * from income_and_expenses where in_ex_id = " + IncomeToExpensesID;
			query = statement.executeQuery(sql);
			IncomeToExpensesType incomeToExpensesType = new IncomeToExpensesType();
			if (query.next()) {
				incomeToExpensesType.setIncomeExpenID(query.getInt("in_ex_id"));
				incomeToExpensesType.setIncomeExpenName(query.getString("in_ex_name"));
			}
			return incomeToExpensesType;
		} catch (SQLException e) {

			//
			e.printStackTrace();
			return null;

		} finally {
			if (conn != null && query != null) {
				try {
					conn.close();
					query.close();
				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
		}
	}

}
