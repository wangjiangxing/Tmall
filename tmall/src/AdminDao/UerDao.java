package AdminDao;
import org.api.dbcontrol.*;
import org.api.sql.*;
public class UerDao {
	private int id;
	private String name;
	private String password;
	private int level;
	private int goldcoin_amount=0;
	public UerDao(int id2, String name2, String password2, int level2, int goldcoin_amount2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.name=name2;
		this.password=password2;
		this.level=level2;
		this.goldcoin_amount=goldcoin_amount2;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getGoldcoin_amount() {
		return goldcoin_amount;
	}
	public void setGoldcoin_amount(int goldcoin_amount) {
		this.goldcoin_amount = goldcoin_amount;
	}
	public void SelectAllUer(){
		
	}

}

