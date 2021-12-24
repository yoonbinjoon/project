<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
<!-- Favicon -->
<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/img/clapperboard.png">	

<title>관리자용 영화 상세보기</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- vendor css -->
<link href="${pageContext.request.contextPath}/resources/template/lib/@fortawesome/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/template/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/template/lib/jqvmap/jqvmap.min.css" rel="stylesheet">
<!-- DashForge CSS -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/template/assets/css/dashforge.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/template/assets/css/dashforge.dashboard.css">
<style>
p{
	text-align:center;
}
</style>

</head>
<header>
<jsp:include page="/WEB-INF/views/adminHeader.jsp" />
</header>
<body>
<div class="row mg-t-30">
	<div class="col-sm-2"></div>
	<div class="col-sm-8">
		<div class="media">
  			<img src="${pageContext.request.contextPath }/fileDownload?posterName=${movieVO.posterName }&mid=${movieVO.mid }" class="rounded mg-r-50" alt="" width="260px" height="374px">
 	 		<div class="media-body">
    			<h2 class="mg-b-15 mg-t-10 tx-inverse">${movieVO.title }</h2>
    			<h6>장르 &nbsp;:&nbsp; ${movieVO.genre }</h6>
    			<h6>상영시간 &nbsp;:&nbsp; ${movieVO.runTime }</h6>
    			<h6>감독 &nbsp;:&nbsp; ${movieVO.director }</h6>
    			<h6>영상타입 &nbsp;:&nbsp; ${movieVO.type }</h6>
    			<h6>등급 &nbsp;:&nbsp; ${movieVO.age }</h6>
    			<h6>출연진 &nbsp;:&nbsp; ${movieVO.cast }</h6>
    			<h6 class="mg-b-50">개봉날짜 &nbsp;:&nbsp; ${movieVO.openDate }</h6>
    		
    			<button type="button" class="btn btn-dark" onclick="window.open('${movieVO.link}')">예고편 보기</button>
    			<button type="button" class="btn btn-danger" onclick="location.href='update?mid=${movieVO.mid}'" >수정하기</button>
    			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">삭제하기</button>
  			</div>
		</div>
	</div>
	<div class="col-sm-2"></div>
</div>
<div class="row mg-t-30">
<div class="col-sm-2"></div>
<div class="col-sm-8">
	<hr class="mg-y-40" style="margin-top: 10px; margin-bottom: 30px;">
	<pre>${movieVO.content }</pre>
</div>
<div class="col-sm-2"></div>

</div>
<div class="row bd-t mg-t-50">
	<div class="col mg-t-20"><p class="tx-30">관람평</p></div>
</div>
<div class="row">
	<div class="col-sm-2"></div>
	<div class="col-sm-8">
	<table class="table table-bordered">
	<thead>
		<tr>
   			<th scope="col" class="col-md-1">아이디</th>
			<th scope="col" class="col-md-1">평점</th>
    		<th scope="col" class="col-md-9">한줄평</th>
    		
		</tr>
	</thead>
	<tbody>
	<c:forEach var="reviewVO" items="${reviewVO}">
		<tr>
			<th scope="row">${reviewVO.id }</th>
			<td>${reviewVO.score }</td>
			<td>${reviewVO.rContent }</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	<div class="col-sm-2"></div>
</div>
<form name="delete">
	<input type="hidden" name="mid" value="${movieVO.mid}">
</form>
<form name="boardInfo">
	
	<input type="hidden" name="mid" value="${movieVO.mid}">
</form>
<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">게시물 삭제</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">게시물을 정말 삭제하시겠습니까?</div>
				<div class="modal-footer">
					
					<button type="button" class="btn btn-primary" onclick="clickDel(boardInfo)">삭제하기</button>
					<button type="button" class="btn btn-secondary" data-dismiss="modal">취소하기</button>
					
				</div>
			</div>
		</div>
	</div>


</body>
<script>
	
		
		function clickDel(formName) {
			
			formName.action = "delete";
			formName.method = "post";
			formName.submit();
		}
</script>
<footer>
	<jsp:include page="/WEB-INF/views/footer.jsp" />
</footer>
</html>