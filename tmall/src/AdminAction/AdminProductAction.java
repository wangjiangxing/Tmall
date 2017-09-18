package AdminAction;

import java.io.File;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.api.dbcontrol.DAO;
import org.api.sql.Connector;

import com.jspsmart.upload.SmartUpload;
import com.opensymphony.xwork2.ActionContext;

import AdminDao.CategoryDao;
import AdminDao.ProductDao;
public class AdminProductAction {
	public static String ProductListInID(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String SelectID=request.getParameter("SelectID");
		//String SelectName=request.getParameter("SelectName");
		System.out.println(SelectID);
		if(SelectID!=null){
			 int selectId=Integer.parseInt(SelectID);
			 if(selectId==0){
				 String sql="select * from product ";
					String return_msg=ProductList1(sql);
					return return_msg; 
			 }
			 else{
			String sql="select * from product where id="+selectId;
			String return_msg=ProductList1(sql);
			return return_msg;
			 }
			 }
		return "sucess";
	}
	public static String ProductListInName(){
		HttpServletRequest request = ServletActionContext.getRequest();
		//String SelectID=request.getParameter("SelectID");
		String SelectName=request.getParameter("SelectName");
		System.out.println(SelectName);
			 //int selectId=Integer.parseInt(SelectID);
			String sql="select * from product where name='"+SelectName+"'";
			String return_msg=ProductList1(sql);
			return return_msg;	
	}
	 
	public static String ProductList1(String sql) {
		 try{
			 List<ProductDao> ProductList=new ArrayList<ProductDao>(); 
	        Connector.initial("sqlserver", "tmall");
			//Connector.setUser("sa");
			//Connector.setPassword("1234");
			DAO dao = new DAO();
			ResultSet rs = dao.select(sql);
	        while(rs.next())  
	        {  
	            int id=rs.getInt("id");  
	            String name=rs.getString("name");
	            String subTitle=rs.getString("subTitle");
	            float orignalPrice=rs.getFloat("orignalPrice");
	            float promotePrice=rs.getFloat("promotePrice");
	            int stock=rs.getInt("stock");
	            int cid=rs.getInt("cid");
	            String createDate=rs.getString("createDate");
	            ProductDao temp=new ProductDao (id,name,subTitle,orignalPrice,promotePrice,stock,cid,createDate);  
	            ProductList.add(temp);  
	        }  
	        HttpServletRequest request = ServletActionContext.getRequest();  
	        request.setAttribute("ProductList", ProductList);  
	        return "sucess"; 
		 }catch (Exception e){
			 e.printStackTrace();
			 return "sucess";
		 }
	}
	public String ProductInsert() throws SQLException{
		HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		String name2=request.getParameter("name");
		String subTitle2=request.getParameter("subTitle");
		float orignalPrice2=Float.parseFloat(request.getParameter("orignalPrice"));
		float promotePrice2=Float.parseFloat(request.getParameter("promotePrice"));
		int stock2=Integer.parseInt(request.getParameter("stock"));
		int cid2=Integer.parseInt(request.getParameter("category_name"));
		String createDate2=request.getParameter("createDate");
		String sql="insert into product(name,subTitle,orignalPrice,promotePrice,stock,cid,createDate) values('"+name2+"','"+subTitle2+"',"+orignalPrice2+","+promotePrice2+","+stock2+","+cid2+",'"+createDate2+"')";
	    Connector.initial("sqlserver", "tmall");
		DAO dao1 = new DAO();
		dao1.insert(sql);
		return "sucess"; 
	}
	public String deleteproduct() throws Exception {  
	    // TODO 自动生成的方法存根  
		HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		int DeleteId=Integer.parseInt(request.getParameter("id"));
		String sql="delete from product where id="+DeleteId;
	    Connector.initial("sqlserver", "tmall");
		DAO dao = new DAO();
		dao.delete(sql);
		return "sucess";  
	}
	public String ModifyProduct() throws SQLException, ParseException{
		HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		int id2=Integer.parseInt(request.getParameter("SelectID"));
		String name2=request.getParameter("mname");
		//String picture2=request.getParameter("picture");
		String subTitle2=request.getParameter("msubTitle");
		float orignalPrice2=Float.parseFloat(request.getParameter("morignalPrice"));
		float promotePrice2=Float.parseFloat(request.getParameter("mpromotePrice"));
		int stock2=Integer.parseInt(request.getParameter("mstock"));
		String createDate2=request.getParameter("mcreateDate");
		//int cid2=Integer.parseInt(request.getParameter("category_name"));
		//String category_name=request.getParameter("category_name");
		//String sql1="select * from category where name='"+category_name+"'";
		//Connector.initial("sqlserver", "tmall");
		//DAO dao = new DAO();
		String sql="update product set name='"+name2+"',subTitle='"+subTitle2+"',orignalPrice="+orignalPrice2+",promotePrice="+promotePrice2+",stock="+stock2+",createDate='"+createDate2+"' where id="+id2+"";
	     Connector.initial("sqlserver", "tmall");
		DAO dao1 = new DAO();
		dao1.insert(sql);
		return "sucess"; 
	}
	public String productlistForAddPicture() throws Exception {  
        // TODO 自动生成的方法存根  
        List<ProductDao> ProductList=new ArrayList<ProductDao>();  
        String sql="select * from product";  
        Connector.initial("sqlserver", "tmall");
		//Connector.setUser("sa");
		//Connector.setPassword("1234");
		DAO dao = new DAO();
		ResultSet rs = dao.select(sql);
        while(rs.next())  
        {  
            int id=rs.getInt("id");  
            String name=rs.getString("name");
             ProductDao temp=new ProductDao (id,name);  
             ProductList.add(temp);  
        }  
        HttpServletRequest request = ServletActionContext.getRequest();  
        request.setAttribute("ProductList", ProductList);  
        return "sucess";  
    }  

}
