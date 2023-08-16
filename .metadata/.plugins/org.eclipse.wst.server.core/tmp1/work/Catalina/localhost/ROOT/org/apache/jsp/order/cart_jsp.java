/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-10 05:03:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"row\" id=\"page_cart\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <h1 class=\"text-center\">장바구니</h1>\r\n");
      out.write("           	<div id=\"div_cart\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "order.jsp", out, false);
      out.write("\r\n");
      out.write(" <script id=\"temp_cart\" type=\"text/x-handlebars-template\">\r\n");
      out.write("	<table class=\"table\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th><input type=\"checkbox\" id=\"all\"></th>\r\n");
      out.write("			<th>상품코드</th><th>상품이미지</th><th>상품이름</th><th>상품가격</th><th>제조사</th><th>상품수량</th><th>상품금액</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		{{#each .}}\r\n");
      out.write("			<tr class=\"tr\" price=\"{{price}}\">\r\n");
      out.write("				<td><input type=\"checkbox\" class=\"chk\" goods=\"{{toString @this}}\"></td>\r\n");
      out.write("				<td class=\"gid\">{{gid}}</td>\r\n");
      out.write("				<td><img src=\"{{image}}\" width=\"50px\"></td>\r\n");
      out.write("				<td>{{title}}</td>\r\n");
      out.write("				<td>{{sum 1 price}}</td>\r\n");
      out.write("				<td>{{maker}}</td>\r\n");
      out.write("				\r\n");
      out.write("				<td><input class=\"qnt\" value=\"{{qnt}}\" size=\"5\" oninput=\"isNumber(this)\">\r\n");
      out.write("				<button class=\"btn btn-primary btn-sm\">변경</button></td>\r\n");
      out.write("				<td>{{sum qnt price}}</td>\r\n");
      out.write("				<td><button class=\"btn btn-danger btn-sm\" gid=\"{{gid}}\">삭제</button></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		{{/each}}\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"8\" class=\"text-end pe-5\">\r\n");
      out.write("				<h5>총합계: <span id=\"sum1\">0원</span></h5>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	<div class=\"text-center\">\r\n");
      out.write("		<button class=\"btn btn-warning px-4\" id=\"btn-order\">주문하기</button>\r\n");
      out.write("	</div>\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("Handlebars.registerHelper(\"toString\", function(goods){\r\n");
      out.write("	return JSON.stringify(goods);\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("Handlebars.registerHelper(\"sum\", function(qnt, price){\r\n");
      out.write("	const sum=qnt*price\r\n");
      out.write("	return sum.toString().replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\") + \"원\";\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("	//숫자인 경우에만 입력\r\n");
      out.write("	function isNumber(item){\r\n");
      out.write("	    item.value=item.value.replace(/[^0-9]/g,'');\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("getList();\r\n");
      out.write("const uid = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("$(\"#div_cart\").on(\"click\", \"#btn-order\", function(){\r\n");
      out.write("	const chk= $(\"#div_cart .chk:checked\").length;\r\n");
      out.write("		if(chk==0){\r\n");
      out.write("			alert(\"상품을 선택해주세요!\")\r\n");
      out.write("		}else if(uid==\"\"){\r\n");
      out.write("			location.href=\"/user/login?target=/cart/list\";\r\n");
      out.write("		}else{\r\n");
      out.write("			let data=[];\r\n");
      out.write("			$(\"#div_cart .chk:checked\").each(function(){\r\n");
      out.write("				const goods= $(this).attr(\"goods\");\r\n");
      out.write("				data.push(JSON.parse(goods));\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			console.log(data);\r\n");
      out.write("			\r\n");
      out.write("			getOrder(data);\r\n");
      out.write("			$(\"#page_order\").show();\r\n");
      out.write("			$(\"#page_cart\").hide();\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	$(\"#div_cart\").on(\"click\", \".chk\", function(){\r\n");
      out.write("		const all= $(\"#div_cart .chk\").length;\r\n");
      out.write("		const chk= $(\"#div_cart .chk:checked\").length;\r\n");
      out.write("		if(all==chk){\r\n");
      out.write("			$(\"#div_cart #all\").prop(\"checked\", true);\r\n");
      out.write("		}else{\r\n");
      out.write("			$(\"#div_cart #all\").prop(\"checked\", false);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	$(\"#div_cart\").on(\"click\", \"#all\", function(){\r\n");
      out.write("		if($(this).is(\":checked\")){\r\n");
      out.write("			$(\"#div_cart .chk\").each(function(){\r\n");
      out.write("				$(\"#div_cart .chk\").prop(\"checked\", true);\r\n");
      out.write("			})\r\n");
      out.write("		}else{\r\n");
      out.write("			$(\"#div_cart .chk\").each(function(){\r\n");
      out.write("				$(\"#div_cart .chk\").prop(\"checked\", false);\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$(\"#div_cart\").on(\"click\", \".btn-primary\", function(){\r\n");
      out.write("		const row=$(this).parent().parent();\r\n");
      out.write("		const gid=row.find(\".gid\").text();\r\n");
      out.write("		const qnt=row.find(\".qnt\").val();\r\n");
      out.write("		if(confirm(gid + \"상품의 수량을\" + qnt+ \"로 변경하시겠습니까?\")){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"get\",\r\n");
      out.write("				url:\"/cart/update\",\r\n");
      out.write("				data:{gid:gid, qnt:qnt},\r\n");
      out.write("				success:function(){\r\n");
      out.write("					getList();\r\n");
      out.write("					alert(\"수정완료!\")\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$(\"#div_cart\").on(\"click\", \".btn-danger\", function(){\r\n");
      out.write("		const gid= $(this).attr(\"gid\");\r\n");
      out.write("		if(confirm(gid + \"삭제하시겠습니까?\")){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				data:{gid:gid},\r\n");
      out.write("				type:\"get\",\r\n");
      out.write("				url:\"/cart/delete\",\r\n");
      out.write("				success:function(){\r\n");
      out.write("					alert(\"삭제완료\")\r\n");
      out.write("					getList();\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	function getList(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type:\"get\",\r\n");
      out.write("			url:\"/cart/list.json\",\r\n");
      out.write("			dataType:\"json\",\r\n");
      out.write("			success:function(data){\r\n");
      out.write("				if(data.length==0){\r\n");
      out.write("					$(\"#div_cart\").html(\"<h3 class='text-center'> 장바구니가 비어있습니다.</h3>\");\r\n");
      out.write("				}else{\r\n");
      out.write("				const temp = Handlebars.compile($(\"#temp_cart\").html());\r\n");
      out.write("				$(\"#div_cart\").html(temp(data));\r\n");
      out.write("				getSum();\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function getSum(){\r\n");
      out.write("		let sum=0;\r\n");
      out.write("		$(\"#div_cart .tr\").each(function(){\r\n");
      out.write("			const price = $(this).attr(\"price\");\r\n");
      out.write("			const qnt= $(this).find(\".qnt\").val();\r\n");
      out.write("			sum+=price*qnt;\r\n");
      out.write("		})\r\n");
      out.write("		$(\"#sum1\").html(sum.toString().replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\") + \"원\");\r\n");
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
