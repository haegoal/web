package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;

import model.ProductDAO;
import model.ProductVO;
import java.text.*;

@WebServlet(value= {"/pro/list", "/pro/list.json", "/pro/insert", "/pro/delete", "/pro/update"})
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDAO dao=new ProductDAO();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	DecimalFormat df = new DecimalFormat("#,###원");
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("/home.jsp");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		switch(request.getServletPath()) {
		case "/pro/list":
			request.setAttribute("pageName", "/pro/list.jsp");
			dis.forward(request, response);
			break;
		case "/pro/list.json":
			int page = request.getParameter("page")==null ? 1 :
				Integer.parseInt(request.getParameter("page"));
			String query = request.getParameter("query")==null ? "" :
				request.getParameter("query") ;
			List<ProductVO> array = dao.list(page, query);
			
			JSONArray jArray = new JSONArray();
			for (ProductVO vo : array) {
				JSONObject obj=new JSONObject();
				obj.put("code", vo.getCode());
				obj.put("name", vo.getName());
				obj.put("frice", vo.getPrice());
				obj.put("price", df.format(vo.getPrice()));
				obj.put("rdate", sdf.format(vo.getRdate()));
				
				jArray.add(obj);
			}
			
			JSONObject jo = new JSONObject();
			jo.put("total", dao.total(query));
			jo.put("items", jArray);
			out.println(jo);
		break;
		}
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getServletPath()) {
		case "/pro/insert":
			ProductVO vo = new ProductVO();
			vo.setName(request.getParameter("name"));;
			vo.setPrice(Integer.parseInt(request.getParameter("price")));
			System.out.println(vo);
			dao.insert(vo);
			break;
		case "/pro/delete":
			int code = Integer.parseInt(request.getParameter("code"));
			dao.delete(code);
			break;
		case "/pro/update":
			vo = new ProductVO();
			vo.setName(request.getParameter("name"));
			vo.setPrice(Integer.parseInt(request.getParameter("price")));
			vo.setCode(Integer.parseInt(request.getParameter("code")));
			dao.update(vo);
			break;
		}
	}

}
