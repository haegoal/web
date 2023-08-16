<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <div class="row my-5 justify-content-center">
        <div class="col-md-8">
            <h1 class="text-center">상품등록</h1>
            <form class="card p-3" name="frm1">
                <input name="name" class="form-control" placeholder="상품이름">
                <input name="price" class="form-control" placeholder="상품가격">
                <div class="text-center">
                    <input type="submit" value="상품등록" class="btn btn-primary">
                    <input type="reset" value="상품취소" class="btn btn-danger">
                </div>
            </form>
        </div>	
   </div>
   
   <script>
   $(frm1).on("submit", function(e){
       e.preventDefault();
       let name= $(frm1.name).val();
       let price= $(frm1.price).val();
       if(name==""){
           alert("이름을 입력해주세요.")
           $(frm1.name).focus();
       }else if(price==""){
           alert("가격을 입력해주세요.")
           $(frm1.price).focus();
       }else if(price.replace(/[0-9]/g,'')){
           alert("숫자로 입력해주세요.")
           $(frm1.price).focus();
       }else{
           if(confirm("등록하시겠습니까?")){
        	   $.ajax({
        		   type:"post",
        		   url:"/pro/insert",
        		   data:{"name":name, "price":price},
        		   success:function(){
        			  alert("등록이 완료되었습니다.");
        			  $(frm1.name).val("");
        			  $(frm1.price).val("");
        			  getlist();
        		   }
        	   })
           }else{
               alert("등록을 취소하였습니다.")
           }
       }
   });
</script>