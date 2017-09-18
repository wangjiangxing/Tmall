package org.api.sql;

import java.sql.Connection;
import java.sql.Statement;
public class Statementor {
	private	 static Statement stat = null;
public static Statement getStatementor(){
	try{
    Connection conn = Connector.getConnector();
	stat = conn.createStatement();
	System.out.println("get Statmentor successful");
	}
	catch(Exception e){
		System.out.println("get Statmentor fault");
	}
	return stat;
}
public static void destory(){
	try{
		stat.close();
		}
		catch(Exception e){
			System.out.println("destory fault");
		}
}
}
