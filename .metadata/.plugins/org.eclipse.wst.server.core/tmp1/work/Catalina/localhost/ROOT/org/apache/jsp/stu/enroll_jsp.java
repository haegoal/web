/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-04 06:26:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.stu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enroll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1690328738969L));
    _jspx_dependants.put("jar:file:/C:/data/web/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/haksa/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

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
      out.write("    \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <h1 class=\"text-center\">수강신청</h1>\r\n");
      out.write("            <div class=\"card p-3\">\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("                <div class=\"col\">학생번호:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.scode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <div class=\"col\">학생이름:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.sname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <div class=\"col\">학생학과:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dept}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <div class=\"col\">학생학년:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.year}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <div class=\"col\">지도교수:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.pname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.advisor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"card p-3 my-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            	<div class=\"col\" id=\"div_c\">\r\n");
      out.write("            	</div>\r\n");
      out.write("            	<div class=\"col\">\r\n");
      out.write("            	<button class=\"btn btn-primary\" id=\"btn-en\">수강신청</button>\r\n");
      out.write("            	</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div id=\"div_enroll\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script id=\"temp_c\" type=\"text/handlebars-template\">\r\n");
      out.write("	<select class=\"form-select\" id=\"lcode\">\r\n");
      out.write("		{{#each .}}\r\n");
      out.write("		<option value=\"{{lcode}}\" {{dis persons capacity}}>\r\n");
      out.write("		{{lname}} {{persons}}/{{capacity}}\r\n");
      out.write("		</option>\r\n");
      out.write("		{{/each}}\r\n");
      out.write("	<select>\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("    <script id=\"temp_enroll\" type=\"text/handlebars-template\">\r\n");
      out.write("	<table class=\"table\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>강의번호</th>\r\n");
      out.write("			<th>강의이름</th>\r\n");
      out.write("			<th>점수</th>\r\n");
      out.write("			<th>수강날짜</th>\r\n");
      out.write("			<th>강의시간</th>\r\n");
      out.write("			<th>강의실</th>\r\n");
      out.write("			<th>교수이름</th>\r\n");
      out.write("			<th>총원</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		{{#each .}}\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>{{lcode}}</td>\r\n");
      out.write("			<td>{{lname}}</td>\r\n");
      out.write("			<td>{{grade}}</td>	\r\n");
      out.write("			<td>{{edate}}</td>\r\n");
      out.write("			<td>{{hours}}</td>\r\n");
      out.write("			<td>{{room}}</td>\r\n");
      out.write("			<td>{{pname}}</td>\r\n");
      out.write("			<td>{{persons}}/{{capacity}}</td>\r\n");
      out.write("			<td><button class=\"btn btn-danger btn-sm\" lcode=\"{{lcode}}\">수강취소</button></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		{{/each}}\r\n");
      out.write("	</table>\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("	Handlebars.registerHelper(\"dis\", function(persons, capacity){\r\n");
      out.write("		if(persons>=capacity) return \"disabled\";\r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("	<script>\r\n");
      out.write("	const scode=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.scode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	$(\"#div_enroll\").on(\"click\", \".btn-danger\", function(){\r\n");
      out.write("		const lcode=$(this).attr(\"lcode\");\r\n");
      out.write("		if(confirm(lcode+ \"강좌를 수강취소하시겠습니까?\")){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"post\",\r\n");
      out.write("				data:{scode:scode,lcode:lcode},\r\n");
      out.write("				url:\"/enroll/delete\",\r\n");
      out.write("				success:function(){\r\n");
      out.write("					alert(\"수강이 취소되었습니다.\");\r\n");
      out.write("					getList();\r\n");
      out.write("					getClist();\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$(\"#btn-en\").on(\"click\", function(){\r\n");
      out.write("		const lcode=$(\"#lcode\").val();\r\n");
      out.write("		if(confirm(lcode + \"강좌를 수강신청하겠습니까?\")){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"get\",\r\n");
      out.write("				data:{\"scode\":scode,\"lcode\":lcode},\r\n");
      out.write("				url:\"/enroll/insert\",\r\n");
      out.write("				success:function(data){\r\n");
      out.write("					if(data==0){\r\n");
      out.write("						alert(\"수강신청이완료되었습니다.\");\r\n");
      out.write("						getList();\r\n");
      out.write("						getClist();\r\n");
      out.write("					}else{\r\n");
      out.write("						alert(\"이미신청한과목입니다.\");\r\n");
      out.write("						\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	getList();\r\n");
      out.write("	getClist();\r\n");
      out.write("	\r\n");
      out.write("	 function getClist(){\r\n");
      out.write("	        $.ajax({\r\n");
      out.write("	            type:\"get\",\r\n");
      out.write("	            url:\"/cou/all.json\",\r\n");
      out.write("	            dataType:\"json\",\r\n");
      out.write("	            success:function(data){\r\n");
      out.write("	                console.log(data);\r\n");
      out.write("	                const temp = Handlebars.compile($(\"#temp_c\").html());\r\n");
      out.write("	                $(\"#div_c\").html(temp(data));\r\n");
      out.write("	            }\r\n");
      out.write("	        })\r\n");
      out.write("	    }\r\n");
      out.write("	 \r\n");
      out.write("    function getList(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"get\",\r\n");
      out.write("            url:\"/stu/enroll.json\",\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            data:{\"scode\":scode},\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                const temp = Handlebars.compile($(\"#temp_enroll\").html());\r\n");
      out.write("                $(\"#div_enroll\").html(temp(data));\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	");
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
