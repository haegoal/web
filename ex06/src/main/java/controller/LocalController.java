package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.*;

@WebServlet(value= {"/local/list", "/local/list.json", "/local/total"})
public class LocalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	localDAO dao = new localDAO();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher dis = request.getRequestDispatcher("/home.jsp");
		switch(request.getServletPath()) {
		case "/local/list":
			request.setAttribute("pageName", "/local/list.jsp");
			dis.forward(request, response);
			break;
		case "/local/list.json":
			int page = request.getParameter("page")==null? 1:
				Integer.parseInt(request.getParameter("page"));
		String query = request.getParameter("query")==null? "":
			request.getParameter("query");
		List<localVO> array = dao.list(page, query);
		JSONArray jarray = new JSONArray();
		for (localVO vo : array) {
			JSONObject ob = new JSONObject();
			ob.put("id", vo.getId());
			ob.put("lid", vo.getLid());
			ob.put("lname", vo.getLname());
			ob.put("laddress", vo.getLaddress());
			ob.put("lphone", vo.getLphone());
			jarray.add(ob);
			}
			out.print(jarray);
			break;
		case "/local/total":
			query = request.getParameter("query")==null? "":
				request.getParameter("query");
			dao.total(query);
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
