<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/view/public/common.jspf" %>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">班级管理</a></li>
        <li>添加班级</li>
    </ul>
</div>

<form action="${pageContext.request.contextPath}/classinfo/classinfo/add.action" method="post" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">班级名称</label>
                <div class="col-sm-9">
                	<input type="text" name="className" class="form-control input-sm" placeholder="请输入班级名称"/>
                </div>
            </div>
        </div>
		<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">教室</label>
                <div class="col-sm-9">
               	   <select name="classroomId" class="form-control input-sm">
                     	<option>培训室一</option>
                        <option>培训室二</option>
                     </select>
                </div>
            </div>
        </div>
    </div>
    
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">开课日期</label>
                <div class="col-sm-9">
                	<input type="text" name="classStartTime" onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="请输入开课日期"/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">结课日期</label>
                <div class="col-sm-9">
                	<input type="text" name="classEndTime" onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="请输入结课日期"/>
                </div>
            </div>
        </div>

    </div>
        <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">班级人数</label>
                <div class="col-sm-9">
               			<input type="text" name="classNumber" class="form-control input-sm" placeholder="请输入班级人数"/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">教师</label>
                <div class="col-sm-9">
               		 <select name="staffId" class="form-control input-sm">
                     	<option>张三</option>
                        <option>李四</option>
                     </select>
                </div>
            </div>

        </div>

    </div>
        <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学科</label>
                <div class="col-sm-9">
               	   <select name="disciplineId" class="form-control input-sm">
                     	<option>java基础</option>
                        <option>C++基础</option>
                     </select>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">课程表</label>
                <div class="col-sm-9">
               		 <select name="syllabusId" class="form-control input-sm">
                     	<option>java</option>
                        <option>C++</option>
                     </select>
                </div>
            </div>

        </div>

    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">描述</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">描述</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="classDesc"></textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>
			<a class="btn btn-warning" href="${pageContext.request.contextPath }/classinfo/classinfo/list.action">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
