<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
</head>

<body>
<form name="icform" method="post">
      <input type="hidden" name="userId" value="${user.userId}"></input>
<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('userAction_update','_self');this.blur();">保存</a></li>
<li id="back"><a href="#" onclick="history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="${ctx}/skin/default/images/icon/currency_yen.png"></img>
   查看用户
  </div> 
  

 
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle">所在部门：</td>
	             <td class="tableContent">
	             <select name="deptId">
	           	   <option value="">---请选择---</option>
	           	   <c:forEach items="${list}"  var="dept">
		        		<option value="${dept.deptId}"  <c:if test="${dept.deptName==d.deptName}">selected</c:if>>${dept.deptName}</option>
		    		</c:forEach>
	    	     </select>	            		
	            </td>
	        </tr>		
	        <tr>
	            <td class="columnTitle">用户姓名：</td>
	            <td class="tableContent"><input type="text" name="userinfo.name" value="${user.name}"/></td>
	        </tr>	
	         <tr>
	            <td class="columnTitle">状态：</td>
	            <td class="tableContentAuto">
	              <input type="radio" name="state" class="input" ${user.state==0?'checked':'' } value="0">停用 
	              <input type="radio" name="state" class="input"  ${user.state==1?'checked':'' } value="1">启用 
	            </td>
	        </tr>		
		</table>
	</div>
 </form>
</body>
</html>