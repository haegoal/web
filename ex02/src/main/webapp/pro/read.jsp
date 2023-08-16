<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="row my-5 justify-content-center">
	<div class="col-md-6">
		<h1>상품정보</h1>
		<div class = "card text-center p-5 my-3">
			<h5>상품코드:${vo.code}</h5>
			<h5>상품이름:${vo.name}</h5>
			<h5>상품코드:<fmt:formatNumber value="${vo.price}" pattern ="#,###원"/></h5>
			<h5>상품코드:<fmt:formatDate value="${vo.rdate}" pattern ="yy-MM-dd HH:mm:ss"/></h5>
		</div>
		<div>
			<button class="btn btn-primary">수정</button>
			<button class="btn btn-danger">삭제</button>
		</div>
	</div>
</div>
<script>
const code= "${vo.code}";

	$(".btn-danger").on("click", function(){
		if(confirm(code + "삭제하시겠습니까?")){
			//삭제로이동
			location.href="/pro/delete?code=" + code;
		}
	})
	$(".btn-primary").on("click", function(){
			location.href="/pro/update?code=" + code;
	})
</script>