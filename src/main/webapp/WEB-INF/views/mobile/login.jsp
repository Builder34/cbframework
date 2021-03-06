<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath() ;
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<html>
<head>
	<base href="<%=basePath%>" />
	<title>个人中心-登录</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="http://apps.bdimg.com/libs/jquerymobile/1.3.0/jquery.mobile-1.3.0.min.css">
	<link rel="stylesheet" href="jqmDemo/css/frame/ios_inspired/styles.css" rel="stylesheet" />
	<link rel="stylesheet" href="jqmDemo/css/global.css">

    <script src="http://apps.bdimg.com/libs/jquery/1.8.2/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jquerymobile/1.3.0/jquery.mobile-1.3.0.min.js"></script>
    
	<script type="text/javascript" charset="utf-8" src="jqmDemo/js/frame/iscroll.js"></script>
	<script type="text/javascript" charset="utf-8" src="jqmDemo/js/global.js"></script>
</head>

<body>
	<div data-role="page" id="loginPage" data-dom-cache="true">
	<script type="text/javascript">
		$("#loginPage").live('pageinit', function() {
		 //bind swipe event
             $('#loginPage').bind("swipeleft",function(){
                    $.mobile.changePage('#regPage',{ transition: "slide"});
                });
			});
		$("#regPage").live("pageshow", function() {
		});
	</script>
		<div data-role="header" data-theme="c">
			<h1>个人中心</h1>
		</div>
		<div data-role="content" data-theme="c">
			<form action="${basePath}ajax!login" method="post" id="loginForm">
                <label for="usrnm" class="ui-hidden-accessible">用户名:</label>
               	<input type="text" name="user" id="usrnm" placeholder="请输入您的用户名">
                <label for="pswd" class="ui-hidden-accessible">密码:</label>
                <input type="password" name="passw" id="pswd" placeholder="请输入您的密码">
				<div data-role="fieldcontain">
					<fieldset data-role="controlgroup" data-type="horizontal"
						data-mini="true">
						<legend>记住登录:</legend>
						<input type="radio" name="saveRadio" id="saveRadio-a" value="1" />
						<label for="saveRadio-a">是</label> <input type="radio"
							name="saveRadio" id="saveRadio-b" value="0" checked="checked" />
						<label for="saveRadio-b">否</label>
					</fieldset>
				</div>
				<a href="#" id="loginButton" data-role="button" data-theme="e"
					onClick="goTo('content.html')" data-icon="arrow-r" data-iconpos="right">登陆 </a> 
					<br/>
					未建立帐号？ <a href="javascript:void(0)" onclick="goTo('#regPage')"
					id="regButton" >点击注册</a>
			</form>
		</div>
	</div>
	
	<!-- reg page -->
	<div data-role="page" id="regPage" data-dom-cache="true" >
		<script type="text/javascript">
		$("#regPage").live('pageinit', function() {
		 //bind swipe event
			 $('#regPage').bind("swiperight",function(){
                    $.mobile.changePage('#loginPage',{ transition: "slide", reverse:true});
                });
             $('#regPage').bind("swipeleft",function(){
                    $.mobile.changePage('#imgPage',{ transition: "slide"});
                });
			});
		$("#regPage").live("pageshow", function() {
		});
	</script>
		<div data-role="header"  data-theme="c">
		<span class="ui-btn-left">
		<a href="#loginPage" 
		data-role="button" data-inline="true" data-icon="back"
		class="ui-btn-left">返回</a> 
		</span>
		<h1>
			个人中心-注册
		</h1>
		</div>
		<div data-role="content" data-theme="c">
			<form action="#" method="post" id="regForm">
				<div data-role="fieldcontain" class="ui-hide-label">
					    <input type="text" name="username" id="username" placeholder="用户名" /> 
						<input type="password" name="password" id="password" placeholder="密码" />
						<input type="password" name="password2" id="password2" value=""
							placeholder=" 确认密码" />
						<a href="#"  data-role="button"  onclick="goTo('#imgPage')">选择头像</a>
						<div id="headimg" class="seleced-user-head-img"></div>
				</div>

				<a href="#loginPage" id="regButton" data-role="button" data-theme="c">注册</a>
				<a href="#loginPage" data-role="button" data-theme="c">取消</a>
			</form>
		</div>
	</div>
	<!-- user head img  page -->
	<div data-role="page" id="imgPage" data-dom-cache="true">
	<script type="text/javascript">
		var myScroll;
		function loaded4() {
			if(myScroll!=null){
				myScroll.destroy();
			}
			myScroll = new iScroll("wrapperHead",{checkDOMChange:false});
		}
		function selectImg(img){
			$("#headimg").html("<img src=\"img/headpic/"+img+".jpg\" onerror=\"errpic(this)\"/>")
			goTo("#regPage");
		}
		$("#imgPage").live('pageinit', function() {
			var content = ""
				for (var i=1;i<11;i++){
						content = content + "<li>";
						content = content + "<a href=\"#\"><img src=\"img/headpic/"+i+".jpg\" onerror=\"errpic(this)\" onclick=\"selectImg("+i+")\"/></a>";
						content = content + "</li>";
					}
			   $("#headpicul").append(content);
			   
			   //bind swipe event
			   $('#imgPage').bind("swiperight",function(){
                    $.mobile.changePage('#regPage',{ transition: "slide", reverse:true});
                });
			});
		$("#imgPage").live("pagebeforeshow", function(){
			setTimeout(loaded4, 200); 
		});
				
		$("#imgPage").live('pageshow', function() {
			
		});
	
	</script>
			<div data-role="header" data-theme="c">
				<span class="ui-btn-left"> <a href="#regPage"
					data-role="button" data-inline="true" data-icon="back"
					class="ui-btn-left">返回</a> </span>
				<h1>
					选择头像
				</h1>
			</div>
			<div data-role="content">
			<div id="wrapperHead" class="wrapper">
					<div id="scrollerHead" class="scroller">
						<ul id="headpicul" class="gallery">
						<!-- 
							<li>
								<a href="#"><img src="img/headpic/1.jpg" onerror="errpic(this)" onclick="selectImg(1)"/></a>
							</li>
							<li>
								<img src="img/headpic/2.jpg" onerror="errpic(this)" />
							</li>  -->
						</ul>
					</div>
				</div>
			</div>
		</div>
		
</body>

</html>