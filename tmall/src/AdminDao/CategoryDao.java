package AdminDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.api.dbcontrol.DAO;
import org.api.sql.Connector;

public class CategoryDao {
	private int id;
	private String name;
	 CategoryDao(){
		
	}
	public  CategoryDao(int id2, String name2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.name=name2; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  int returnCategoryId(String name) throws SQLException{
		String sql="select id from category where name="+name;
		Connector.initial("sqlserver", "tmall");
		//Connector.setUser("sa");
		//Connector.setPassword("1234");
		DAO dao = new DAO();
		ResultSet set = dao.select(sql);
		
		return set.getInt("id");
		
	}
}
