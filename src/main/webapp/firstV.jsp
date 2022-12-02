<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gogogo(){
	location.href = "SecondC?a=20&b=200";
	}
</script>

</head>
<body>
<%
//사용자가 어떠한 액션을 했을 ㄸ ㅐ 페이지 이동하는것을 요청 이라고 표현한다.
// 요청에는 3가지 방법이있다.
// 1. a태그 를 써서 클릭하면 GET 방식의 요청
// 2. JS를 써서 어떤 이벤트를 추가했을 ㄸ ㅐ 그 함수불러오는 ex)href GET 방식을 썼고
//		JS 로 HTML만드는게 가능 JS 로 form을 만들면 post방식도 가능 ! 하지만 대체적으로 GET방식.
// 3. form과 button 을 조합해서 버튼을 클릭햇을 ㄸ ㅐ GET/POST 방식 을 지정한대로 요청을 할 수있음;


%>
<h1>First</h1>
d:${sessionScope.d }<br>
e:${cookie.e.value }<br>
<a href="SecondC?a=10&b=100">SecondC로 ㄱ</a>
<hr>
<div onclick="gogogo();"> SecondC로 ㄱ</div>
<hr>
<form action="SecondC">
<input name="a"><br>
<input name="b"><br>
<button>SecondC로</button>


</form>
</body>
</html>