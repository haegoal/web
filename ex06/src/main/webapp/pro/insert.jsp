<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <div class="row mb-5 justify-content-center">
        <div class="col-md-5">
            <h1 class="text-center">상품등록</h1>
            <form class="card p-3" name="frm1">
            	<div class="input-group mb-3">
            	<span class="input-group-text">상품이름</span>
            	<input class="form-control" name="name">
            	</div>
            	<div class="input-group mb-3">
            	<span class="input-group-text">상품가격</span>
            	<input class="form-control" name="price">
            	</div>
            	<div class="text-center">
            		<input type="submit" value="등록" class="btn btn-primary">
            		<input type="reset" value="취소" class="btn btn-danger">
            	</div>
            </form>
            </div>
        </div>
 </div>
 <script>
 $(frm1).on("submit", function(e){
		e.preventDefault();
     const name= $(frm1.name).val();
     const price = $(frm1.price).val();
     if(name==""){
         alert("이름을 입력해주세요.")
         $(frm1.name).focus();
     }else if(price==""){
         alert("가격을 입력해주세요.")
         $(frm1.price).focus();
     }else if(price.replace(/[0-9]/g,'')){
         alert("숫자만 입력바람>")
         $(frm1.price).val("");
         $(frm1.price).focus();
     }else{
         if(confirm("등록하시겠습니까?")){
             $.ajax({
                 type:"post",
                 data:{"name":name, "price":price},
                 url:"/pro/insert",
                 success:function(){ 
                	alert("등록이완료되었습니다.")
                	getTotal();
					$(frm1.name).val("");
					$(frm1.price).val("");
                 }
             })
         }else{
             alert("등록이 취소되었습니다.")
         }
     }
	})
 </script>