<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="insert.jsp"/>
  <div class="row">
        <div class="col">
            <h1 class="text-center">상품목록</h1>
            <div class="row justify-content-end mb-5">
            	<form class="col-6 col-md-4" name="frm">
            		<div class="input-group">
            			<input name="query" class="form-control" placeholder="검색">
            			<button class="btn btn-primary">검색</button>
            		</div>
            	</form>
            	<div class="col text-end mt-4">
            		<span>검색수:</span>
            		<span id="total">100</span>
            	</div>
            </div>
            <div id="div_pro"></div>
            <div id="pagination" class="pagination justify-content-center"></div>
        </div>
</div>
<script id="temp_pro" type="text/x-handlebars.template">
    <table class="table">
    {{#each .}}
        <tr>
            <td class="code">{{code}}</td>
            <td><input value="{{name}}" class="name"></td>
            <td>
				<input value="{{price}}" class="price">
				<span class="fprice">{{fprice}}</span>
			</td>
            <td>{{fdate}}</td>
			<td><button class="btn btn-danger btn-sm" code={{code}}>삭제</button></td>
			<td><button class="btn btn-success btn-sm">수정</button></td>
        </tr>
    {{/each}}
    </table>
</script>
<script>
let query=$(frm.query).val();

$("#div_pro").on("click", ".btn-success", function(){
	const row= $(this).parent().parent();
	const name= row.find(".name").val();
	const price = row.find(".price").val();
	const code = row.find(".code").text();
	if(confirm("수정하실래요")){
		$.ajax({
			type:"post",
			url:"/pro/update",
			data:{"code":code, "name":name, "price":price},
			success:function(){
				alert("수정완료!");
				getList();
			}
		})
	}else{
		alert("취소되었습니다.")
	}
})

$("#div_pro").on("click", ".btn-danger", function(){
	const code = $(this).attr("code");
	if(confirm(code + "를 삭제하시겠습니까?")){
		$.ajax({
			type:"post",
			data:{"code":code},
			url:"/pro/delete",
			success:function(){
				alert("삭제완료");
				getTotal();
			}
		})
	}else{
		alert("삭제를 취소했습니다.")
	}
})

$(frm).on("submit", function(e){
	e.preventDefault();
	query=$(frm.query).val();
	getTotal();
	getList();
})
    function getList(page){
        $.ajax({
            type:"get",
            url:"/pro/list.json",
            data:{"query":query, "page":page},
            dataType:"json",
            success:function(data){
                console.log(data);
                const temp = Handlebars.compile($("#temp_pro").html());
                $("#div_pro").html(temp(data));
            }
        })
    }
    
    $('#pagination').twbsPagination({
	    totalPages:1,	// 총 페이지 번호 수
	    visiblePages: 10,	// 하단에서 한번에 보여지는 페이지 번호 수
	    startPage : 1, // 시작시 표시되는 현재 페이지
	    initiateStartPageClick: false,	// 플러그인이 시작시 페이지 버튼 클릭 여부 (default : true)
	    first : '<i class="bi bi-skip-backward-fill"></i>',	// 페이지네이션 버튼중 처음으로 돌아가는 버튼에 쓰여 있는 텍스트
	    prev : '<i class="bi bi-skip-start-fill"></i>',	// 이전 페이지 버튼에 쓰여있는 텍스트
	    next : '<i class="bi bi-skip-end-fill"></i>',	// 다음 페이지 버튼에 쓰여있는 텍스트
	    last : '<i class="bi bi-skip-forward-fill"></i>',	// 페이지네이션 버튼중 마지막으로 가는 버튼에 쓰여있는 텍스트
	    onPageClick: function (event, page) {  
	    	getList(page);
	    }
	});
    
    getTotal();
    function getTotal(){
        $.ajax({
            type:"get",
            url:"/pro/total",
            data:{"query":query},
            dataType:"json",
            success:function(data){
                const totalPages=Math.ceil(data/5);
                $("#total").html(data);
                if(totalPages==0){
                	$("#pagination").hide();
                }else{
                	$("#pagination").show();
                	$("#pagination").twbsPagination("changeTotalPages", totalPages, 1);
                }
            }
        })
    }
</script>