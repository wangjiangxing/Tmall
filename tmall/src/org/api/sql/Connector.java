package org.api.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
private	 static Connection conn = null;
private	 static String url = "jdbc:mysql://127.0.0.1/mysql";
private	 static String user = "root";
private	 static String password = "admin";
private  static String name = "com.mysql.jdbc.Driver";

public static String getUrl() {
	return url;
}
public static void setUrl(String url) {
	Connector.url = url;
}
public static String getUser() {
	return user;
}
public static void setUser(String user) {
	Connector.user = user;
}
public static String getPassword() {
	return password;
}
public static void setPassword(String password) {
	Connector.password = password;
}
public static String getName() {
	return name;
}
public static void setName(String name) {
	Connector.name = name;
}
public static Connection getConnector(){
	try{
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("Connector Initial Successful");
		}
		catch (Exception e){
			System.out.println("Connector Initial fault");
			e.printStackTrace();
		}
	    return conn;
}
public static void initial(String dbType,String  dbName){
	if(dbType.equalsIgnoreCase("mysql")){
		url = "jdbc:mysql://127.0.0.1/"+dbName;
		user = "root";
		password = "admin";
		name = "com.mysql.jdbc.Driver";
	}
	if(dbType.equalsIgnoreCase("sqlserver")){
		url = "jdbc:odbc:"+dbName;
		user = "sa";
		password = "1234";
		name = "sun.jdbc.odbc.JdbcOdbcDriver";
	}
	else{
		System.out.println("we use the default setting");
	}
}
public static void destory(){
	try{
	conn.close();
	}
	catch(Exception e){
		System.out.println("destory fault");
	}
}
}
