package AdminAction;
import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.util.ArrayList;  
import java.util.List;  
import javax.servlet.http.HttpServletRequest;  

import org.apache.struts2.ServletActionContext;

import AdminDao.CategoryDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;  
import org.api.dbcontrol.DAO;
import org.api.sql.Connector; 
public class AdminCategoryAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String categorylist() throws Exception {  
        // TODO 自动生成的方法存根  
        List<CategoryDao> CategoryList=new ArrayList<CategoryDao>();  
        String sql="select * from category";  
        Connector.initial("sqlserver", "tmall");
		//Connector.setUser("sa");
		//Connector.setPassword("1234");
		DAO dao = new DAO();
		ResultSet rs = dao.select(sql);
        while(rs.next())  
        {  
            int id=rs.getInt("id");  
            String name=rs.getString("name");
            CategoryDao temp=new CategoryDao (id,name);  
            CategoryList.add(temp);  
        }  
        HttpServletRequest request = ServletActionContext.getRequest();  
        request.setAttribute("Categorylist", CategoryList);  
        return "sucess";  
    }  
	public String deletecategory() throws Exception {  
	    // TODO 自动生成的方法存根  
		HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		int DeleteId=new Integer(request.getParameter("id"));
		String sql="delete from category where id="+DeleteId;
	    Connector.initial("sqlserver", "tmall");
		DAO dao = new DAO();
		dao.delete(sql);
		return "sucess";  
	}
	public String addcategory() throws Exception {  
	    // TODO 自动生成的方法存根  
		HttpServletRequest  request= (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		String Addname=request.getParameter("name");
		String sql="insert into category(name) values('"+Addname+"')";
	    Connector.initial("sqlserver", "tmall");
		DAO dao = new DAO();
		dao.insert(sql);
		return "sucess";  
	}
}