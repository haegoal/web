<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class ="row my-5 justify-content-center">
	<div class="col-md-6">
		<h1 class="text-center mb-5">상품수정</h1>
		<form class="card p-3" method="post" name="frm">
		<div class="input-group my-2">
				<span class="input-group-text">상품코드</span>
				<input class="form-control" name="code" value="${vo.code}" readonly>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">상품이름</span>
				<input class="form-control" name="name" value="${vo.name}">
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">상품가격</span>
				<input class="form-control" name="price" value="${vo.price}">
			</div>
			<div class="text-center mt-3">
				<input type="submit" value="상품수정" class="btn btn-primary">
				<input type="reset" value="상품취소" class="btn btn-secondary">
			</div>
		</form>
	</div>
</div>
<script>
$(frm).on("submit", function(e){
	e.preventDefault();
	let name= $(frm.name).val();
	let price = $(frm.price).val();
	if(name==""){
		alert("이름입력바람!>")
		$(frm.name).focus();
	}else if(price==""){
		alert("가격입력바람!>")
		$(frm.price).focus();
	}else if(price.replace(/[0-9]/g,'')){
		alert("숫자만입력바람!>")
		$(frm.price).val("");
		$(frm.price).focus();
	}else{
		if(confirm("상품을 수정하시겠습니까?")){
			frm.submit();
		}
	}
})
</script>