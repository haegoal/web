/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-31 07:49:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.local;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <h1 class=\"text-center\">지역목록</h1>\r\n");
      out.write("            <div class=\"row justify-content-end mb-5\">\r\n");
      out.write("            	<form class=\"col-6 col-md-4\" name=\"frm\">\r\n");
      out.write("            		<div class=\"input-group\">\r\n");
      out.write("            			<input name=\"query\" class=\"form-control\" placeholder=\"검색\">\r\n");
      out.write("            			<button class=\"btn btn-primary\">검색</button>\r\n");
      out.write("            		</div>\r\n");
      out.write("            	</form>\r\n");
      out.write("            	<div class=\"col text-end mt-4\">\r\n");
      out.write("            		<span>검색수:</span>\r\n");
      out.write("            		<span id=\"total\">100</span>\r\n");
      out.write("            	</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("            <div id=\"div_local\"></div>\r\n");
      out.write("            <div id=\"pagination\" class=\"pagination justify-content-center\"></div>\r\n");
      out.write("<script id=\"temp_local\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    {{#each .}}\r\n");
      out.write("    <table class=\"table\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>{{id}}</td>\r\n");
      out.write("            <td>{{lid}}</td>\r\n");
      out.write("            <td>{{lname}}</td>\r\n");
      out.write("            <td>{{laddress}}</td>\r\n");
      out.write("            <td>{{lphone}}</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    {{/each}}          \r\n");
      out.write(" </script>\r\n");
      out.write("   <script>\r\n");
      out.write("    let query=\"\";\r\n");
      out.write("    let page=1;\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    getList();\r\n");
      out.write("    function getList(page){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"get\",\r\n");
      out.write("            url:\"/local/list.json\",\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            data:{\"query\":query, \"page\":page},\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                const temp= Handlebars.compile($(\"#temp_local\").html());\r\n");
      out.write("                $(\"#div_local\").html(temp(data));\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    getTotal();\r\n");
      out.write("    function  getTotal(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"get\",\r\n");
      out.write("            url:\"/local/total\",\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            data:{\"query\":query},\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                const totalPages=Math.ceil(data/5);\r\n");
      out.write("                $(\"#total\").html(data);\r\n");
      out.write("                $(\"#pagination\").twbsPagination(\"changeTotalPages\", totalPages, 1)\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    $('#pagination').twbsPagination({\r\n");
      out.write("	    totalPages:21,	// 총 페이지 번호 수\r\n");
      out.write("	    visiblePages: 10,	// 하단에서 한번에 보여지는 페이지 번호 수\r\n");
      out.write("	    startPage : 1, // 시작시 표시되는 현재 페이지\r\n");
      out.write("	    initiateStartPageClick: false,	// 플러그인이 시작시 페이지 버튼 클릭 여부 (default : true)\r\n");
      out.write("	    first : '<<',	// 페이지네이션 버튼중 처음으로 돌아가는 버튼에 쓰여 있는 텍스트\r\n");
      out.write("	    prev : '<',	// 이전 페이지 버튼에 쓰여있는 텍스트\r\n");
      out.write("	    next : '>',	// 다음 페이지 버튼에 쓰여있는 텍스트\r\n");
      out.write("	    last : '>>',	// 페이지네이션 버튼중 마지막으로 가는 버튼에 쓰여있는 텍스트\r\n");
      out.write("	    onPageClick: function (event, page) {  \r\n");
      out.write("	    	getList(page);\r\n");
      out.write("	    }\r\n");
      out.write("	});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}