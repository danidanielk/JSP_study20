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
//����ڰ� ��� �׼��� ���� �� �� ������ �̵��ϴ°��� ��û �̶�� ǥ���Ѵ�.
// ��û���� 3���� ������ִ�.
// 1. a�±� �� �Ἥ Ŭ���ϸ� GET ����� ��û
// 2. JS�� �Ἥ � �̺�Ʈ�� �߰����� �� �� �� �Լ��ҷ����� ex)href GET ����� ���
//		JS �� HTML����°� ���� JS �� form�� ����� post��ĵ� ���� ! ������ ��ü������ GET���.
// 3. form�� button �� �����ؼ� ��ư�� Ŭ������ �� �� GET/POST ��� �� �����Ѵ�� ��û�� �� ������;


%>
<h1>First</h1>
d:${sessionScope.d }<br>
e:${cookie.e.value }<br>
<a href="SecondC?a=10&b=100">SecondC�� ��</a>
<hr>
<div onclick="gogogo();"> SecondC�� ��</div>
<hr>
<form action="SecondC">
<input name="a"><br>
<input name="b"><br>
<button>SecondC��</button>


</form>
</body>
</html>