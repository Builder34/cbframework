<%--
  Created by IntelliJ IDEA.
  User: Builder34
  Date: 2015-10-31
  Time: 14:00
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
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>订阅号后台管理系统</title>
        <meta name="Keywords" content=""/>
        <%@ include file="/WEB-INF/views/common/intoHead.jsp" %>
    </head>

    <body>
    <%@ include file="/WEB-INF/views/common/header.jsp" %>

    <div id="bjui-container" class="clearfix">
        <%@ include file="/WEB-INF/views/common/leftMenu.jsp" %>

        <div id="bjui-navtab" class="tabsPage">
            <div class="tabsPageHeader">
                <div class="tabsPageHeaderContent">
                    <ul class="navtab-tab nav nav-tabs">
                        <li data-url=""><a href="javascript:;"><span><i class="fa fa-home"></i> #maintab#</span></a></li>
                    </ul>
                </div>
                <div class="tabsLeft"><i class="fa fa-angle-double-left"></i></div>
                <div class="tabsRight"><i class="fa fa-angle-double-right"></i></div>
                <div class="tabsMore"><i class="fa fa-angle-double-down"></i></div>
            </div>
            <ul class="tabsMoreList">
                <li><a href="javascript:;">#maintab#</a></li>
            </ul>

            <div class="navtab-panel tabsPageContent">
                <div class="navtabPage unitBox">

                    <div class="bjui-pageHeader" style="background:#FFF;">
                        <div style="padding: 0 15px;">
                            <div class="row">
                                <div class="col-md-4">
                                    <h5>项目GIT：<a href="http://git.oschina.net/xvpindex/ewsdOA" target="_blank">http://git.oschina.net/xvpindex/ewsdOA</a></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>技术博客：<a href="http://www.topstack.cn" target="_blank">http://www.topstack.cn</a></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>联系方式：xvpindex@qq.com</h5>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
    </body>
    </html>
