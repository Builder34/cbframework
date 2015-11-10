<%--
  Created by IntelliJ IDEA.
  User: Builder34
  Date: 2015-10-31
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<div data-role="page">
    <div data-role="header">
        <h1>个人中心</h1>
    </div>

    <div data-role="main" class="ui-content">

        <div class="ui-content" style="min-width:250px;">
            <form method="post" action="demoform.php">
                <div>
                    <h3>登录信息</h3>
                    <label for="usrnm" class="ui-hidden-accessible">用户名:</label>
                    <input type="text" name="user" id="usrnm" placeholder="请输入您的用户名">
                    <label for="pswd" class="ui-hidden-accessible">密码:</label>
                    <input type="password" name="passw" id="pswd" placeholder="请输入您的密码">
                    <%--<label for="log">保存登录</label>--%>
                    <%--<input type="checkbox" name="login" id="log" value="1" data-mini="true">--%>
                    <button class="ui-btn ui-shadow ui-corner-all ui-btn-icon-right ui-icon-arrow-r">登录</button>
                </div>
            </form>
        </div>
    </div>

    <div data-role="footer">
        <h1></h1>
    </div>
</div>

</body>
</html>