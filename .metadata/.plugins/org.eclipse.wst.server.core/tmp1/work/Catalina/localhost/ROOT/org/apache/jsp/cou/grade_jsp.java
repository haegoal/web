/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-04 07:46:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cou;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"row my-5\">\r\n");
      out.write("	<div class=\"col\">\r\n");
      out.write("		<h1 class=\"text-center mb-5\">점수입력</h1>\r\n");
      out.write("		<div class=\"card p-3\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col\">강좌번호:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.lcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("				<div class=\"col-4\">강좌이름:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("				<div class=\"col\">담당교수:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.pname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("				<div class=\"col\">강의시수:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.hours}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("				<div class=\"col\">수강인원:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.persons}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.capacity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div id=\"div_grade\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 성적목록 템플릿-->\r\n");
      out.write("<script id=\"temp_grade\" type=\"text/x-handlebar-templates\">\r\n");
      out.write("	<table class=\"table\">\r\n");
      out.write("		{{#each .}}\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td class=\"scode\">{{scode}}</td>\r\n");
      out.write("			<td>{{sname}}</td>\r\n");
      out.write("			<td>{{dept}}</td>\r\n");
      out.write("			<td>{{edate}}</td>\r\n");
      out.write("			<td width=\"100\">\r\n");
      out.write("				<input class=\"grade form-control text-end\" value=\"{{grade}}\" \r\n");
      out.write("						oninput=\"isNumber(this)\"></td>\r\n");
      out.write("			<td><button class=\"btn btn-primary btn-sm\">수정</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		{{/each}}\r\n");
      out.write("	</table>\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("	const lcode=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.lcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	getList();\r\n");
      out.write("	\r\n");
      out.write("	$(\"#div_grade\").on(\"click\", \".btn-primary\", function(){\r\n");
      out.write("		const row=$(this).parent().parent();\r\n");
      out.write("		const scode=row.find(\".scode\").text();\r\n");
      out.write("		const grade=row.find(\".grade\").val();\r\n");
      out.write("		if(confirm(scode + \"학생의 점수를 \" + grade + \"로 수정하실래요?\")){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"post\",\r\n");
      out.write("				url:\"/grade/update\",\r\n");
      out.write("				data:{lcode:lcode, scode:scode, grade:grade},\r\n");
      out.write("				success:function(){\r\n");
      out.write("					alert(\"점수가 수정되었습니다.\");\r\n");
      out.write("					getList();\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	function getList(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type:\"get\",\r\n");
      out.write("			url:\"/cou/grade.json\",\r\n");
      out.write("			data:{lcode:lcode},\r\n");
      out.write("			dataType:\"json\",\r\n");
      out.write("			success:function(data){\r\n");
      out.write("				const temp=Handlebars.compile($(\"#temp_grade\").html());\r\n");
      out.write("				$(\"#div_grade\").html(temp(data));\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	//숫자인 경우에만 입력\r\n");
      out.write("	function isNumber(item){\r\n");
      out.write("	    item.value=item.value.replace(/[^0-9]/g,'');\r\n");
      out.write("	}\r\n");
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
