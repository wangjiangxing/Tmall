/*
	 Format:
	 if you want change default setting
	 use the setter method to change the URL, name,etc
	 1.setter() or Connector.initial()
	 2.create a DAO instance;
	 3.structure a SQL string;
	 4.use the DAO instance method to complete what you want
	 */
package org.api.dbcontrol;
import java.sql.ResultSet;
import java.sql.Statement;
import org.api.sql.Statementor;
public class DAO {
public String SQL_MESSAGE;
public int UPDATE_LINES = 0;
private static Statement stat = null;
public static ResultSet set = null;
public DAO(){
	try{
		 stat = Statementor.getStatementor();
		}
		catch(Exception e){
			SQL_MESSAGE = "get statmentor fault";
			System.out.println("get statmentor fault");
		}
}
public void insert(String sql){
	try{
		UPDATE_LINES=stat.executeUpdate(sql);
		SQL_MESSAGE = "INSERT SUCCESSFUL";
		System.out.println(SQL_MESSAGE);
	}
	catch(Exception e){
		SQL_MESSAGE = "INSERT FAULT";
		System.out.println(SQL_MESSAGE);
		e.printStackTrace();
	}
}
public  void update(String sql){
	try{
		UPDATE_LINES=stat.executeUpdate(sql);
		SQL_MESSAGE = "UPDATE SUCCESSFUL";
		System.out.println(SQL_MESSAGE);
	}
	catch(Exception e){
		SQL_MESSAGE = "UPDATE FAULT";
		System.out.println(SQL_MESSAGE);
		e.printStackTrace();
	}
}
public  ResultSet select(String sql){
	try{
		set = stat.executeQuery(sql);
		SQL_MESSAGE = "SELECT SUCCESSFUL";
		System.out.println(SQL_MESSAGE);
	}
	catch(Exception e){
		SQL_MESSAGE = "SELECT FAULT";
		System.out.println(SQL_MESSAGE);
	}
	return set;
}
public void delete(String sql){
	try{
		UPDATE_LINES=stat.executeUpdate(sql);
		SQL_MESSAGE = "DELETE SUCCESSFUL";
		System.out.println(SQL_MESSAGE);
	}
	catch(Exception e){
		SQL_MESSAGE = "DELETE FAULT";
		System.out.println(SQL_MESSAGE);
		e.printStackTrace();
	}
}
}
