package controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.*;


@WebServlet(value= {"/pro/list", "/pro/list.json", "/pro/total", "/pro/insert", "/pro/delete", "/pro/update"})
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDAO dao = new ProductDAO();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	DecimalFormat df = new DecimalFormat("#,###원");
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher dis = request.getRequestDispatcher("/home.jsp");
		switch(request.getServletPath()) {
		case "/pro/list":
			request.setAttribute("pageName", "/pro/list.jsp");
			dis.forward(request, response);
			break;
		case "/pro/list.json":
			int page = request.getParameter("page")==null ? 1:
			Integer.parseInt(request.getParameter("page"));
			String query = request.getParameter("query")==null ? "":
				request.getParameter("query");
			List<ProductVO> array = dao.list(page, query);
			JSONArray jarray = new JSONArray();
			for (ProductVO vo : array) {
				JSONObject obj = new JSONObject();
				obj.put("code", vo.getCode());
				obj.put("price", vo.getPrice());
				obj.put("fprice", df.format(vo.getPrice()));
				//obj.put("rdate", vo.getRdate());
				obj.put("fdate", sdf.format(vo.getRdate()));
				obj.put("name", vo.getName());
				jarray.add(obj);
			}
			out.print(jarray);
			break;
		case "/pro/total":
			query = request.getParameter("query")==null ? "":
				request.getParameter("query");
			out.print(dao.total(query));
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getServletPath()) {
		case "/pro/insert":
			ProductVO vo = new ProductVO();
			vo.setName(request.getParameter("name"));
			vo.setPrice(Integer.parseInt(request.getParameter("price")));
			System.out.println(vo.toString());
			dao.insert(vo);
			break; 
		case "/pro/delete":
			int code= Integer.parseInt(request.getParameter("code"));
			System.out.println(code);
			dao.delete(code);
			break;
		case "/pro/update":
			vo = new ProductVO();
			vo.setCode(Integer.parseInt(request.getParameter("code")));
			vo.setName(request.getParameter("name"));
			vo.setPrice(Integer.parseInt(request.getParameter("price")));
			System.out.println(vo.toString());
			dao.update(vo);
			break;
		}
	}

}
