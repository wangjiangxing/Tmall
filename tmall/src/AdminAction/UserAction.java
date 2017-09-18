package AdminAction;
import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.util.ArrayList;  
import java.util.List;  
import javax.servlet.http.HttpServletRequest;  

import org.apache.struts2.ServletActionContext;  
  
import AdminDao.UerDao;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;  
import org.api.*;
import org.api.dbcontrol.DAO;
import org.api.sql.Connector; 
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String showlist() throws Exception {  
        // TODO 自动生成的方法存根  
        List<UerDao> UserList=new ArrayList<UerDao>();  
        String sql="select * from account";  
        Connector.initial("sqlserver", "tmall");
		//Connector.setUser("sa");
		//Connector.setPassword("1234");
		DAO dao = new DAO();
		ResultSet rs = dao.select(sql);
        while(rs.next())  
        {  
            int id=rs.getInt("id");  
            String name=rs.getString("name");
            String password=rs.getString("password");
            int level=rs.getInt("level");
            int goldcoin_amount=rs.getInt("goldcoin_amount");
            UerDao temp=new UerDao(id,name,password,level,goldcoin_amount);  
            UserList.add(temp);  
        }  
        HttpServletRequest request = ServletActionContext.getRequest();  
        request.setAttribute("Userlist", UserList);  
        return "sucess";  
    }  
	public String deleteuser() throws Exception {  
	    // TODO 自动生成的方法存根  
		 HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	   int DeleteId=new Integer(request.getParameter("id"));
		 String sql="delete from account where id="+DeleteId;
	    Connector.initial("sqlserver", "tmall");
		DAO dao = new DAO();
		dao.delete(sql);
		return "sucess";  
	}
}