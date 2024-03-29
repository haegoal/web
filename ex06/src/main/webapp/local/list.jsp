<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <div class="row">
        <div class="col">
            <h1 class="text-center">지역목록</h1>
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
        </div>
</div>
            <div id="div_local"></div>
            <div id="pagination" class="pagination justify-content-center"></div>
<script id="temp_local" type="text/x-handlebars-template">
    {{#each .}}
    <table class="table">
        <tr>
            <td>{{id}}</td>
            <td>{{lid}}</td>
            <td>{{lname}}</td>
            <td>{{laddress}}</td>
            <td>{{lphone}}</td>
        </tr>
    </table>
    {{/each}}          
 </script>
   <script>
    let query="";
    let page=1;

    
    getList();
    function getList(page){
        $.ajax({
            type:"get",
            url:"/local/list.json",
            dataType:"json",
            data:{"query":query, "page":page},
            success:function(data){
                console.log(data);
                const temp= Handlebars.compile($("#temp_local").html());
                $("#div_local").html(temp(data));
            }
        })
    }
    getTotal();
    function  getTotal(){
        $.ajax({
            type:"get",
            url:"/local/total",
            dataType:"json",
            data:{"query":query},
            success:function(data){
                const totalPages=Math.ceil(data/5);
                $("#total").html(data);
                $("#pagination").twbsPagination("changeTotalPages", totalPages, 1)
            }
        })
    }
    
    $('#pagination').twbsPagination({
	    totalPages:21,	// 총 페이지 번호 수
	    visiblePages: 10,	// 하단에서 한번에 보여지는 페이지 번호 수
	    startPage : 1, // 시작시 표시되는 현재 페이지
	    initiateStartPageClick: false,	// 플러그인이 시작시 페이지 버튼 클릭 여부 (default : true)
	    first : '<<',	// 페이지네이션 버튼중 처음으로 돌아가는 버튼에 쓰여 있는 텍스트
	    prev : '<',	// 이전 페이지 버튼에 쓰여있는 텍스트
	    next : '>',	// 다음 페이지 버튼에 쓰여있는 텍스트
	    last : '>>',	// 페이지네이션 버튼중 마지막으로 가는 버튼에 쓰여있는 텍스트
	    onPageClick: function (event, page) {  
	    	getList(page);
	    }
	});
</script>