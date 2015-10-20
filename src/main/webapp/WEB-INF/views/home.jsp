<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath() ;
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<html>
<head>
	<base href="<%=basePath%>" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Cache-Control" content="no-store" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
	<title>框架测试</title>
	<link rel="stylesheet" type="text/css" href="statics/jquery-easyui-1.3.2/themes/bootstrap/easyui.css" />
	<link rel="stylesheet" type="text/css" href="statics/jquery-easyui-1.3.2/themes/icon.css" />
	<link rel="stylesheet" type="text/css" href="statics/zTree_v3/css/zTreeStyle/zTreeStyle.css" />

</head>
<body class="easyui-layout">
	 名字：${lcb }
	<div id="header" data-options="region:'north',border:false,split:true">
		<div class="headerNav" style="border-bottom: 0px solid #91c950">
			
		</div>
	</div>
	
	<div data-options="region:'west',split:true" title="导航菜单" class="cs-west">
		<div id='wnav' class="easyui-accordion" data-options="fit:true,border:false,animate:true" style="width: 150px;"></div>
	</div>

	<div id="mainPanle" data-options="region:'center'" class="cs-mainPanle">
		<div id="tabs" class="easyui-tabs" data-options="fit:true,border:false">
			<div title="首页" style="padding: 20px; overflow: hidden;" id="home">
				<h1>欢迎光临！！</h1>
			</div>
		</div>
	</div>
	
	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
	</div>
	<div id="coltree">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	
	
	<script type="text/javascript" src="statics/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="statics/jquery-easyui-1.3.2/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="statics/zTree_v3/js/jquery.ztree.core-3.5.min.js"></script>
	<script type="text/javascript" src="statics/lhgdialog-4.2.0/lhgdialog.min.js?self=false&skin=mac"></script>
</body>
</html>