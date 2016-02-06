/**
 * Test.java
 * com.snail.test
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月30日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.snail.test;

import java.util.List;

import org.junit.Test;

import com.snail.dao.AccountTypeDao;
import com.snail.entity.AccountSubType;

/**
 * ClassName:Test<br/>
 * Function: TODO ADD FUNCTION<br/>
 * Reason:	 TODO ADD REASON<br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月30日		下午8:49:15
 *
 * @see 	 

 */
public class MyTest {
	@Test
	public void test(){
		AccountTypeDao dao = new AccountTypeDao();
		List<AccountSubType> limitAccountSubTypeDao = dao.getLimitAccountSubTypeDao(0, 20);
		for (AccountSubType accountSubType : limitAccountSubTypeDao) {
			System.out.print(accountSubType.getAccountSubTypeName()+"\t");
			System.out.print(accountSubType.getAccountSubTypeID()+"\t");
			System.out.print(accountSubType.getAccountSuperType().getIncomeToExpensesType().getIncomeExpenName()+"\t");
			System.out.print(accountSubType.getAccountSuperType().getAccountSuperTypeName()+"\t");
			System.out.println();
		}
		
	}
	
	

}

