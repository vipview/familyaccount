package com.snail.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Properties;

/**
 * 
 * ClassName:DBconnection<br/>
 * 
 * Function: 连接数据库<br/>
 * 
 * Reason:	 TODO ADD REASON<br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016	2016年1月27日		下午4:40:59
 *
 * @see
 */
public class DBconnection {
/**
 * 
 * getConnection:(得到数据库的连接对象)<br/>
 * TODO(这里描述这个方法适用条件 – 可选)<br/>
 * TODO(这里描述这个方法的执行流程 – 可选)<br/>
 * TODO(这里描述这个方法的使用方法 – 可选)<br/>
 * TODO(这里描述这个方法的注意事项 – 可选)<br/>
 *
 * @param  @return    设定文件
 * @return Connection    DOM对象
 * @throws 
 * @since  CodingExample　Ver 1.1
 */
	public static Connection getConnection() {
		try {

			Properties p = new Properties();
			p.load(DBconnection.class.getResourceAsStream("db2.properties"));
			Class.forName(p.getProperty("driver"));
			return DriverManager.getConnection(p.getProperty("url"), p.getProperty("name"), p.getProperty("pwd"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 

	}

}
