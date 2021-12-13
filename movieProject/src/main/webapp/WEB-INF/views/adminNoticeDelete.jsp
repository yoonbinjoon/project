<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script>
function backToList(obj){
	obj.action = "list";
	obj.submit();
}
</script>
<title>공지사항 삭제</title>
</head>
<body>

<c:if test="${ret>0 }">
	<script>
      setTimeout(function(){
    	 var yesno = confirm("삭제되었습니다.");
         location.href='../list';
         
      },0000)
      </script>
</c:if>

<c:if test="${ret==0 }">
	<script>
      setTimeout(function(){
    	 var yesno = confirm("삭제에 실패하였습니다.");
         location.href='../list';
         
      },0000)
      </script>
</c:if>
	<input type="button" value="리스트로 돌아가기" onclick="backToList(this.form)" />
	
</body>
</html>