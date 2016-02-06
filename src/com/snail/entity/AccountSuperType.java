/**
 * AccountSuperType.java
 * com.snail.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月30日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.snail.entity;
/**
 * ClassName:AccountSuperType<br/>
 * Function: 账单父类型<br/>
 * Reason:	 <br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月30日		下午3:39:56
 *
 * @see 	 

 */
public class AccountSuperType {
	private int AccountSuperTypeID=0;
	private IncomeToExpensesType incomeToExpensesType = null;
	private String accountSuperTypeName=null;
	public AccountSuperType() {

		// 

	}
	public int getAccountSuperTypeID() {
		return AccountSuperTypeID;
	}
	public void setAccountSuperTypeID(int accountSuperTypeID) {
		AccountSuperTypeID = accountSuperTypeID;
	}
	public IncomeToExpensesType getIncomeToExpensesType() {
		return incomeToExpensesType;
	}
	public void setIncomeToExpensesType(IncomeToExpensesType incomeToExpensesType) {
		this.incomeToExpensesType = incomeToExpensesType;
	}
	public String getAccountSuperTypeName() {
		return accountSuperTypeName;
	}
	public void setAccountSuperTypeName(String accountSuperTypeName) {
		this.accountSuperTypeName = accountSuperTypeName;
	}
	public AccountSuperType(int accountSuperTypeID, IncomeToExpensesType incomeToExpensesType,
			String accountSuperTypeName) {
		super();
		AccountSuperTypeID = accountSuperTypeID;
		this.incomeToExpensesType = incomeToExpensesType;
		this.accountSuperTypeName = accountSuperTypeName;
	}
	

}

