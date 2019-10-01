<%@ page contentType = "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ServletJspProgramming</title>
		<style type="text/css">
			#wrapper{
				width : 100%;
				height : 100vh;
				display : flex;
				flex-direction : column;
			}
			#header{
				margin-bottom : 10px;
				border-bottom : 1px solid black;
			}
			#content{
				flex-grow : 1;
				display : flex;
				min-height : 0;
			}
			#sideBar{
				width : 300px;
				background-color : rgb(206,157,255);
				padding-right : 10px;
				border-right : 1px solid black;
				overflow-y : scroll;
			}
			#center{
				flex-grow : 1;
				background-color : rgb(151,203,255);
				padding:10px;
			}
			#center iframe{
				width : 100%;
				margin-top : 0px;
				height : 100%;
			}
			#footer{
				border-top : 1px solid black;
				margin-top : 10px;
				margin-bottom : 10px;
			}
		</style>
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h3>ServletJspProgramming</h3>
			</div>
			<div id="content">
				<div id="sideBar">
					<ul>
						<li><a href="dispatcher1" target="iframe">서블릿 작성과 URL 맵핑</a></li>
						<li><a href="dispatcher2" target="iframe">서블릿 초기화</a></li>
						<li><a href="dispatcher3?name=leegaeul&age=25&tel=0101231234" target="iframe">GET 방식으로 요청</a></li>
						<!-- a태그는 무조건 get방식 -->
						<li>
							<form action="dispatcher3" method="get" target="iframe"> <!-- method는 생략하면 default값으로 get이 들어감 -->
								<input type="text" name="name" value="leegaeul"/>
								<input type="number" name="age" value="25"/>
								<input type="tel" name="tel" value="0101231234"/>
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
							
							<form action="dispatcher3" method="post" target="iframe">
								<input type="text" name="name" value="leegaeul"/>
								<input type="number" name="age" value="25"/>
								<input type="tel" name="tel" value="0101231234"/>
								<input type="submit" value="POST 방식으로 요청"/>
							</form>
						</li>
						<li><a href="dispatcher4" target="iframe">응답 보내기</a></li>
						<li>
							<form action="dispatcher5" method="get" target="iframe">
								<input type="text" name="name" value="leegaeul"/>
								<input type="number" name="age" value="25"/>
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
							
							<form action="dispatcher5" method="post" target="iframe">
								<input type="text" name="name" value="jjungmook"/>
								<input type="number" name="age" value="27"/>
								<input type="submit" value="POST 방식으로 요청"/>
							</form>
						</li>
						<li>
							<form action="dispatcher6" method="get" target="iframe">
								<input type="text" name="title"/>
								<input type="text" name="content"/>
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
							
							<form action="dispatcher6" method="post" target="iframe">
								<input type="text" name="title"/>
								<input type="text" name="content"/>
								<input type="submit" value="POST 방식으로 요청"/>
							</form>
						</li>
						<li>
							<p>객체 사용 범위</p>
							<a href="dispatcher7" target="iframe">객체 저장하기</a>
							<a href="dispatcher8" target="iframe">객체 가져오기</a>
						</li>
					</ul>
				</div>
				<div id="center">
					<iframe name="iframe" src="http://tomcat.apache.org" frameborder="0">
					</iframe>
				</div>
			</div>
			<div id="footer">2019. IoT. L.H.B</div>
		</div>
	</body>
</html>