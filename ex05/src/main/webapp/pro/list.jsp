<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="insert.jsp"/>
 
<div class="row my-5">
        <div class="col">
            <h1 class="text-center mb-5">상품목록</h1>
            <div class="row justify-content-end mb-3">
            <form class="col-6 col-md-3 col-lg-3 input-group" name="frm" class="hide">
                <input name="query" class="form-control" placeholder="검색어">
                <button class="btn btn-primary" >검색</button>
                <span id="total" class="ms-3">20건</span>
            </form>
            </div>
            <div id="div_pro"></div>
            <div class="text-center">
            <button class="hide btn btn-primary" id="prev">이전</button>
            <span id="page" class="hide">1/10</span>
            <button class="hide btn btn-primary" id="next">다음</button>
            </div>
        </div>
    </div>
<script id="temp_pro" type="text/x-handlebars-template">
    <table class="table">
		<tr>
			<td><input type="checkbox" id="all" class="hide"></td>
		<tr>
        {{#each items}}
            <tr>
				<td><input type="checkbox" class="chk"></td>
                <td class="code">{{code}}</td>
                <td><input value="{{name}}" class="name"></td>
                <td><input value="{{frice}}" class="price">{{price}}</td>
                <td>{{rdate}}</td>
				<td><button class="btn btn-danger btn-sm" code={{code}}>삭제</button></td>
				<td><button class="btn btn-warning btn-sm">수정</button></td>
            </tr>
        {{/each}}
    </table>
</script>
<script>
    let page=1;
    let query="";
    
    $(frm).on("submit", function(e){
    	e.preventDefault();
    	page=1;
    	query=$(frm.query).val();
    	getlist();
    })
    
    $("#next").on("click", function(){
    	page++;
    	getlist();
    });
    $("#prev").on("click", function(){
    	page--;
    	getlist();
    });
    
    getlist();
    function getlist(){
        $.ajax({
            type:"get",
            url:"/pro/list.json",
            data:{"page":page, "query":query},
            dataType:"json",
            success:function(data){
            	console.log(data);
            	const temp=Handlebars.compile($("#temp_pro").html());
                $("#div_pro").html(temp(data));
                let last = Math.ceil(data.total/5);
                if(page==1) $("#prev").attr("disabled", true)
                else $("#prev").attr("disabled", false);
                if(page==last) $("#next").attr("disabled", true)
                else $("#next").attr("disabled", false);

                $("#page").html(page + "/" + last);
                $("#total").html(data.total + "건");
                
                if(data.total==0){
                	$(".hide").hide();
                	$("#total").hide();
                }else{
                	$(".hide").show();
                	$("#total").show();
                }
            }
        });
    }
    
    $("#div_pro").on("click", ".btn-danger", function(){
    	let code= $(this).attr("code");
    	if(confirm(code + "번 제품을 삭제하시겠습니까?")){
    		$.ajax({
    			type:"post",
    			data:{"code":code},
    			url:"/pro/delete",
    			success:function(){
    				alert("삭제완");
    				getlist();
    			}
    		})
    	}else{
    		alert("삭제가 취소되었습니다.");
    	}
    });
   
    $("#div_pro").on("click", ".btn-warning", function(){
        let row=$(this).parent().parent();
    	let code=row.find(".code").text();
    	let name=row.find(".name").val();
    	let price=row.find(".price").val();
        if(confirm(code + "/" + name + "/" + price)){
            $.ajax({
                type:"post",
                url:"/pro/update",
                data:{"name":name, "price":price, "code":code},
                success:function(){
                    alert("수정완료")
                    getlist();
                }
            })
        }else{
            alert("수정이 취소되었습니다.")
            getlist();
        }
    });

    
</script>