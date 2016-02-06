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

import java.util.List;

import com.snail.dao.AccountTypeDao;
import com.snail.entity.AccountSubType;
import com.snail.entity.AccountSuperType;
import com.snail.entity.IncomeToExpensesType;

/**
 * ClassName:GetAccountType<br/>
 * Function: TODO ADD FUNCTION<br/>
 * Reason:	 TODO ADD REASON<br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月30日		下午4:29:43
 *
 * @see 	 

 */
public class GetAccountType {
	/**
	 * 
	 * getLimitAccountSubType:(用户来得到通过查询的数据库得到的数据)<br/>
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
	public List<AccountSubType> getLimitAccountSubType(int page,int num){
		//这里需要得到是属于支出还是属于收入
		//考虑返回的的参数(返回是那个实体对象)
		AccountTypeDao dao  = new AccountTypeDao();
		return dao.getLimitAccountSubTypeDao(page, num);
	}
	
	/**
	 * 
	 * getAccountSubType:(通过该方法得到dao层里面的查询数据库得到的数据)<br/>
	 * TODO(这里描述这个方法适用条件 – 可选)<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
	 *
	 * @param  @param AccountSubTypeID
	 * @param  @return    设定文件
	 * @return AccountSubType    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public AccountSuperType getAccountSuperType(int AccountSuperTypeID){
		
		AccountTypeDao dao  = new AccountTypeDao();
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
	 * @param  @param IncomeToExpensesTypeID
	 * @param  @return    设定文件
	 * @return IncomeToExpensesType    
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public IncomeToExpensesType getIncomeToExpensesType(int IncomeToExpensesTypeID){
		
		AccountTypeDao dao  = new AccountTypeDao();
		return dao.getIncomeToExpenses(IncomeToExpensesTypeID);
		
		
		
	}

}

