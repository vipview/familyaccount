/**
 * AccountSubType.java
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
 * ClassName:AccountSubType<br/>
 * Function: 账单子类型<br/>
 * Reason:	 <br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月30日		下午3:40:40
 *
 * @see 	 

 */
public class AccountSubType {
	int accountSubTypeID=0;
	AccountSuperType accountSuperType = null;
	String AccountSubTypeName = null;
	public AccountSubType() {

		// 

	}
	public int getAccountSubTypeID() {
		return accountSubTypeID;
	}
	public void setAccountSubTypeID(int accountSubTypeID) {
		this.accountSubTypeID = accountSubTypeID;
	}
	public AccountSuperType getAccountSuperType() {
		return accountSuperType;
	}
	public void setAccountSuperType(AccountSuperType accountSuperType) {
		this.accountSuperType = accountSuperType;
	}
	public String getAccountSubTypeName() {
		return AccountSubTypeName;
	}
	public void setAccountSubTypeName(String accountSubTypeName) {
		AccountSubTypeName = accountSubTypeName;
	}
	public AccountSubType(int accountSubTypeID, AccountSuperType accountSuperType, String accountSubTypeName) {
		super();
		this.accountSubTypeID = accountSubTypeID;
		this.accountSuperType = accountSuperType;
		AccountSubTypeName = accountSubTypeName;
	}
}

