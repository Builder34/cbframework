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
	
	<style type="text/css">
		.footer{
			width: 100% ;
			text-align: center;
			line-height: 35px; 
		}
		.top-bg{
			background-color: #d8e4fe;
			height: 80px;
		}
	</style>
</head>
<body class="easyui-layout">
	<div region="north" border="true" split="true" style="overflow: hidden; height: 80px;">
		<div class="top-bg"></div>
	</div>
	<div region="south" border="true" split="true" style="overflow: hidden;height: 40px;">
		<div class="footer">版权所有：<a href="#">吖彪快跑34</a></div>
	</div>
	<div region="west" split="true" title="导航菜单" style="width: 200px;">
		<div id="left_menu" class="easyui-accordion" style="position: absolute; top: 27px; left: 0px; right: 0px; bottom: 0px;">
			<div title="博文管理" iconcls="icon-save" style="overflow: auto; padding: 10px;">
				<ul class="easyui-tree">
					<li>
						<span>一级菜单</span>
						<ul>
							<li>
								<span>二级菜单</span>
								<ul>
									<li>
										<span><a target="mainFrame" href="https://www.baidu.com">百度一下</a></span>
									</li>
									<li>
										<span><a href="#">File 12</a></span>
									</li>
									<li>
										<span>File 13</span>
									</li>
								</ul>
							</li>
							<li>
								<span>File 2</span>
							</li>
							<li>
								<span>File 3</span>
							</li>
						</ul>
					</li>
					<li>
						<span><a href="#">File 21</a></span>
					</li>
				</ul>
			</div>
			<div title="新闻管理" iconcls="icon-reload" selected="true" style="padding: 10px;">
				content2
			</div>
			<div title="资源管理" style="padding: 10px;">
                content3 
            </div>
		</div>
		<!-- left_menu  end -->
	</div>
	<div id="mainPanle" region="center" style="overflow: hidden;"></div>
	
<!-- js资源 -->	
<script type="text/javascript" src="statics/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="statics/jquery-easyui-1.3.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="statics/zTree_v3/js/jquery.ztree.core-3.5.min.js"></script>
<script type="text/javascript" src="statics/lhgdialog-4.2.0/lhgdialog.min.js?self=false&skin=mac"></script>
<script type="text/javascript">
	
</script>
</body>
</html>