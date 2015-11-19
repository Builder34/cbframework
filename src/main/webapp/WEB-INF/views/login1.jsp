<%--
  Created by IntelliJ IDEA.
  User: Builder34
  Date: 2015-10-31
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath() ;
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <base href="<%=basePath%>" />
    <link rel="shortcut icon" href="statics/favicons.png" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>后台管理-系统登录</title>
    <script type="text/javascript" src="statics/BJUI_3rdPlugin/BJUI/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="statics/BJUI_3rdPlugin/BJUI/js/jquery.cookie.js"></script>
    <script type="text/javascript" src="statics/BJUI_3rdPlugin/js/sha256.js"></script>
    <link href="statics/BJUI_3rdPlugin/BJUI/themes/css/bootstrap.min.css" rel="stylesheet">
    <link href="statics/css/login.css"  rel="stylesheet" />
    <script type="text/javascript" src="statics/js/login.js"></script>
</head>
<body>
<!--[if lte IE 7]>
<style type="text/css">
    #errorie {position: fixed; top: 0; z-index: 100000; height: 30px; background: #FCF8E3;}
    #errorie div {width: 900px; margin: 0 auto; line-height: 30px; color: orange; font-size: 14px; text-align: center;}
    #errorie div a {color: #459f79;font-size: 14px;}
    #errorie div a:hover {text-decoration: underline;}
</style>
<div id="errorie"><div>您还在使用老掉牙的IE，请升级您的浏览器到 IE8以上版本 <a target="_blank" href="http://windows.microsoft.com/zh-cn/internet-explorer/ie-8-worldwide-languages">点击升级</a>&nbsp;&nbsp;强烈建议您更改换浏览器：<a href="http://down.tech.sina.com.cn/content/40975.html" target="_blank">谷歌 Chrome</a></div></div>
<![endif]-->
<div class="main_box">
    <div class="setting"><a href="javascript:;" onclick="choose_bg();" title="更换背景"><span class="glyphicon glyphicon-th-large"></span></a></div>
    <div class="login_box">
        <div class="login_logo">
            <img src="statics/BJUI_3rdPlugin/images/logo.png" >
        </div>
        <!--
		<c:if test="${!empty message}">
			<div class="login_msg">
	      		<font color="red">${message }</font>
	    	</div>
	    </c:if>
        -->
        <div class="login_form">
            <%--<input type="hidden" value="${randomKey }" id="j_randomKey" />--%>
            <form action="login/verify" id="login_form" method="post">
                <input type="hidden" name="jfinal_token" value="${jfinal_token }" />
                <div class="form-group">
                    <label for="j_username" class="t">用户名：</label> <input id="j_username" value="" name="loginName" type="text" class="form-control x319 in" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="j_password" class="t">密　码：</label> <input id="j_password" value="" name="loginPassword" type="password" class="form-control x319 in">
                </div>
                <div class="form-group">
                    <label for="j_captcha" class="t">验证码：</label> <input id="j_captcha" name="clickCode" type="text" class="form-control x164 in">
                    <img id="captcha_img" alt="点击更换" title="点击更换" src="code.jsp" class="m" onclick="changeCodeImage()" />
                </div>
                <div class="form-group">
                    <label class="t"></label>
                    <label for="j_remember" class="m"><input id="j_remember" type="checkbox" value="true">&nbsp;记住登陆账号!</label>
                </div>
                <div class="form-group space">
                    <label class="t"></label>　　　
                    <input type="submit" id="login_ok" value="&nbsp;登&nbsp;录&nbsp;" class="btn btn-primary btn-lg">&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
                </div>
            </form>
        </div>
    </div>
    <div class="bottom">Copyright &copy; <a href="#">吖彪快跑</a> 2015 - 2016  Build by <a href="http://b-jui.com" target="_blank">B-JUI</a> - 系统登陆</div>
</div>
<script type="text/javascript">
    $(function () {
        $("#login_form").submit(function(){
            var issubmit = true;
            var i_index  = 0;
            $(this).find('.in').each(function(i){
                if ($.trim($(this).val()).length == 0) {
                    $(this).css('border', '1px #ff0000 solid');
                    issubmit = false;
                    if (i_index == 0)
                        i_index  = i;
                }
            });
            if (!issubmit) {
                $(this).find('.in').eq(i_index).focus();
                return false;
            }
            var $remember = $("#j_remember");
            if ($remember.attr('checked')) {
                $.cookie(COOKIE_NAME, $("#j_username").val(), { path: '/', expires: 15 });
            } else {
                $.cookie(COOKIE_NAME, null, { path: '/' });  //删除cookie
            }
            $("#login_ok").attr("disabled", true).val('登陆中..');
            //加密算法，暂时不用先
            var password = HMAC_SHA256_MAC($("#j_username").val(), $("#j_password").val());
            $("#j_password").val(HMAC_SHA256_MAC($("#j_randomKey").val(), password));
            
            return issubmit;
        });
    }) ;
</script>
</body>
</html>
