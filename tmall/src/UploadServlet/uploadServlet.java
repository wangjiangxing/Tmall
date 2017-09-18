package UploadServlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.api.dbcontrol.DAO;
import org.api.sql.Connector;

import javax.servlet.*;
import com.jspsmart.upload.*;


/**
 * Servlet implementation class uploadServlet
 */
@WebServlet("/uploadServlet")
public class uploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SmartUpload smartUpload=new SmartUpload();
		ServletConfig config=this.getServletConfig();
		smartUpload.initialize(config,request, response );
		int id=Integer.parseInt(request.getParameter("category_name"));
		System.out.println(id);
		try{
			smartUpload.upload();
			File smartFile=smartUpload.getFiles().getFile(0);
			smartFile.saveAs("/ProductPicture/"+id+".jpg",smartUpload.SAVE_VIRTUAL);
			//String filename=smartFile.getFileName();
			String sql="insert into productimage(pid) values("+id+")";
			Connector.initial("sqlserver", "tmall");
			//Connector.setUser("sa");
			//Connector.setPassword("1234");
			DAO dao = new DAO();
			 dao.update(sql);
			 response.sendRedirect("ProductList1.action?SelectID=0");
		}catch (SmartUploadException e){
			e.printStackTrace();
		}
	}

}
