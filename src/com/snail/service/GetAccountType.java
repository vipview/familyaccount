/**
 * GetAccountType.java
 * com.snail.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月30日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.snail.service;

import java.util.HashSet;
import java.util.List;

import com.snail.dao.AccountTypeDao;
import com.snail.entity.AccountSubType;
import com.snail.entity.AccountSuperType;
import com.snail.entity.IncomeToExpensesType;

/**
 * ClassName:GetAccountType<br/>
 * Function: TODO ADD FUNCTION<br/>
 * Reason: TODO ADD REASON<br/>
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月30日 下午4:29:43
 *
 * @see
 * 
 */
public class GetAccountType {

	/**
	 * 
	 * getIncomeToExpensesType:(通过dao层返回,所有收支你\类型的数据)<br/>
	 *
	 * @param @return
	 *            设定文件
	 * @return List<IncomeToExpensesType> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<IncomeToExpensesType> getAllIncomeToExpensesType() {

		AccountTypeDao dao = new AccountTypeDao();
		return dao.getAllIncomeToExpenses();

	}

	/**
	 * 
	 * getAccountSuperType:(通过dao层返回所用的,父类型数据)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param @return
	 *            设定文件
	 * @return List<AccountSuperType> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<AccountSuperType> getAllAccountSuperType() {
		// 这里需要得到是属于支出还是属于收入
		// 考虑返回的的参数(返回是那个实体对象)
		AccountTypeDao dao = new AccountTypeDao();
		// 以下注释部分表示去掉list集合里面字符串重复的元素
		// List<AccountSuperType> allAccountSuperType =
		// dao.getAllAccountSuperType();

		// for ( int i = 0 ; i < allAccountSuperType.size() - 1 ; i ++ ) {
		// for ( int j = allAccountSuperType.size() - 1 ; j > i; j -- ) {
		// if (allAccountSuperType.get(j).getAccountSuperTypeName().
		// equals(allAccountSuperType.get(i).getAccountSuperTypeName())) {
		// allAccountSuperType.remove(j);
		// }
		// }
		// }
		// for (AccountSuperType accountSuperType : allAccountSuperType) {
		// System.out.println(accountSuperType.getAccountSuperTypeName());
		// System.out.println("1");
		// }
		return dao.getAllAccountSuperType();
	}

	/**
	 * 
	 * getLimitAccountSubType:(用户来得到通过查询的数据库得到的数据)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param @return
	 *            设定文件
	 * @return List<AccountSuperType> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<AccountSubType> getLimitAccountSubType(int page, int num) {
		// 这里需要得到是属于支出还是属于收入
		// 考虑返回的的参数(返回是那个实体对象)
		AccountTypeDao dao = new AccountTypeDao();
		return dao.getLimitAccountSubTypeDao(page, num);
	}

	/**
	 * 
	 * getAccountSubType:(通过dao层得到数据库里面对应的账单子类型)<br/>
	 *
	 * @param @param
	 *            sub_bt_id
	 * @param @return
	 *            设定文件
	 * @return AccountSubType DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public AccountSubType getAccountSubType(int sub_bt_id) {
		AccountTypeDao accountSubType = new AccountTypeDao();

		return accountSubType.getAccountSubTypeDao(sub_bt_id);
	}

	/**
	 * 
	 * getAccountSubType:(通过该方法得到dao层里面的查询数据库得到的数据)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param @param
	 *            AccountSubTypeID
	 * @param @return
	 *            设定文件
	 * @return AccountSubType DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public AccountSuperType getAccountSuperType(int AccountSuperTypeID) {

		AccountTypeDao dao = new AccountTypeDao();
		return dao.getAccountSuperType(AccountSuperTypeID);

	}

	/**
	 * 
	 * getIncomeToExpensesType:(得到账单的收支类型)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param @param
	 *            IncomeToExpensesTypeID
	 * @param @return
	 *            设定文件
	 * @return IncomeToExpensesType
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public IncomeToExpensesType getIncomeToExpensesType(int IncomeToExpensesTypeID) {

		AccountTypeDao dao = new AccountTypeDao();
		return dao.getIncomeToExpenses(IncomeToExpensesTypeID);

	}

	/**
	 * 
	 * getAccountSuperTypeByInexID:(通过收入类型的id 查找父类型的里面属于该收入类型的选项)<br/>
	 *
	 * @param @param
	 *            inexID
	 * @param @return
	 *            设定文件
	 * @return List<AccountSuperType> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<AccountSuperType> getAccountSuperTypeByInexID(String inexID) {

		AccountTypeDao dao = new AccountTypeDao();
		return dao.querySuperTypeByInexID(inexID);
	}

	public void delSubType(String id) {
		AccountTypeDao dao = new AccountTypeDao();
		dao.deleteSubType(id);
		
	}
}
