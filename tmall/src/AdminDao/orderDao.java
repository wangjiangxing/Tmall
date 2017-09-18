package AdminDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.api.dbcontrol.DAO;
import org.api.sql.Connector;

public class orderDao {
	private int id;
	private int pid;
	private int uid;
	private int number;
	private String status;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public orderDao(int id2,int pid2,int uid2,String status2 ){
		this.id=id2;
		this.pid=pid2;
		this.uid=uid2;
		this.status=status2;
	}
}
