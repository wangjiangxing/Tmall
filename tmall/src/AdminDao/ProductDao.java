package AdminDao;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.api.dbcontrol.*;
import org.api.sql.*;

import com.opensymphony.xwork2.ActionContext;
public class ProductDao {
	private int id;
	private String name;
	private String subTitle;
	private float orignalPrice;
	private float promotePrice;
	private int stock;
	private int cid;
	private String createDate;
	public ProductDao(int id2, String name2, String subTitle2, float orignalPrice2,float promotePrice2,int stock2,int cid2,String createDate2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.name=name2;
		this.subTitle=subTitle2;
		this.orignalPrice=orignalPrice2;
		this.promotePrice=promotePrice2;
		this.stock=stock2;
		this.cid=cid2;
		this.createDate=createDate2;	
	}
	public ProductDao(int id2, String name2) {
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
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public float getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(float orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public float getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(float promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}

