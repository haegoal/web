<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class ="row">
	<div class="col">
		<h1 class="text-center mb-5">상품목록</h1>
		<table class="table">
		<c:forEach items="${array}" var="vo">
			<tr >
				<td>${{vo.code}}</td>
				<td><a href="/pro/read?code=${vo.code}">${{vo.name}}</a></td>
				<td><fmt:formatNumber value="${vo.price}" pattern = "#,###"/></td>
				<td><fmt:formatDate value="${vo.rdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>
		</c:forEach>
		</table>
			<div class="text-center">
				<button class="btn btn-primary mx-3" id="prev">이전</button>
				<span id="page">1</span>
				<button class="btn btn-primary mx-3" id="next">다음</button>
			</div>
	</div>
</div>
<script>
	let page= "${page}";
	let total = "${total}";
	let last=Math.ceil(total/5);
	$("#page").text(page + "/" + last);
	$("#prev").on("click", function(){
		page--;
		location.href="/pro/list?page=" + page;
	})
	$("#next").on("click", function(){
		page++;
		location.href="/pro/list?page=" + page;
	})
	
	if(page==1){
		$("#prev").attr("disabled", true);
	}else{
		$("#prev").attr("disabled", false);
	}
	
	
</script>
