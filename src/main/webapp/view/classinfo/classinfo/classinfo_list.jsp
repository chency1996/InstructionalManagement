<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/view/public/common.jspf"%>
</head>

<body>
	<script type="text/javascript">
		function query(condition){
			$("#keyword").attr("name",condition.value);
		}
	</script>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="${pageContext.request.contextPath}/classinfo/classinfo/list.action">班级信息</a></li>
		</ul>
	</div>
	<form class="form-inline">
		<div class="row alert alert-info" style="margin: 0px; padding: 3px;">
		<form class="form-horizontal" action="${pageContext.request.contextPath}/classinfo/classinfo/list.action" method="post">
			<div class="col-sm-1">查询条件：</div>
			<div class="col-sm-3">
		    	<select class="form-control  input-sm" onchange="query(this)" name="condition">
		        	<option value="">请选择</option>
		        	<option value="classId">班级编号</option>
		            <option value="className">班级名称</option>
		        </select>
	    	</div>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="keyword" placeholder="请输入">
			</div>
			<input type="submit" class="btn btn-danger" value="查询"/>
			<input type="button" class="btn btn-success" value="添加" onclick="javascript:window.location='${pageContext.request.contextPath}/view/classinfo/classinfo/classinfo_add.jsp'" />
		</form>
	</div>
		<div class="row" style="padding: 15px; padding-top: 0px;">
			<table class="table  table-condensed table-striped">
			</table>
			<display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/classinfo/classinfo/list.action">
				<display:column property="classId" title="班级编号"/>
				<display:column property="className" title="班级名称" href="${pageContext.request.contextPath }/classinfo/classinfo/show.action" paramId="classId" paramProperty="classId"/>
				<display:column property="classNumber" title="班级人数"/>
				<display:column property="classStartTime" title="开班日期" format="{0,date,yyyy年MM月dd日}"/>
				<display:column property="classEndTime" title="结束日期" format="{0,date,yyyy年MM月dd日}"/>
				<display:column href="${pageContext.request.contextPath }/classinfo/classinfo/load.action" paramId="classId" paramProperty="classId" value="修改" title="修改"/>
				<display:column href="${pageContext.request.contextPath }/classinfo/classinfo/delete.action" paramId="classId" paramProperty="classId" value="删除" title="删除"/>
			</display:table>
		</div>
	</form>
</body>
</html>
