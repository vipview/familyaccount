/**
 * IncomeToExpensesType.java
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
 * ClassName:IncomeToExpensesType<br/>
 * Function: 收支类型实体类<br/>
 * Reason:	 <br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月30日		下午3:33:23
 *
 * @see 	 

 */
public class IncomeToExpensesType {
	private  int incomeExpenID=0;
	private String incomeExpenName=null;
	public IncomeToExpensesType() {

		// 

	}
	public int getIncomeExpenID() {
		return incomeExpenID;
	}
	public void setIncomeExpenID(int incomeExpenID) {
		this.incomeExpenID = incomeExpenID;
	}
	public String getIncomeExpenName() {
		return incomeExpenName;
	}
	public void setIncomeExpenName(String incomeExpenName) {
		this.incomeExpenName = incomeExpenName;
	}
	public IncomeToExpensesType(int incomeExpenID, String incomeExpenName) {
		super();
		this.incomeExpenID = incomeExpenID;
		this.incomeExpenName = incomeExpenName;
	}

}

