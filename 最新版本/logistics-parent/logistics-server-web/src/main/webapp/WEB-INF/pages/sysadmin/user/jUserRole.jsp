<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<style type="text/css">
	  span{display: inline-block;width: 160px}
	</style>
	<%--  inline-block  一行显示不完，整个换行--%>
</head>

<body>
<form name="icform" method="post">
	<input type="hidden" name="userId" value="${user.userId}"/>

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('userAction_role','_self');this.blur();">保存</a></li>
<li id="back"><a href="#" onclick="formSubmit('userAction_list','_self');this.blur();">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
<div class="textbox" id="centerTextbox">
  <div class="textbox-header">
  <div class="textbox-inner-header">
  <div class="textbox-title">
  <%--用户对象 --%>
    用户 [${user.name}] 角色列表
  </div> 
  </div>
  </div>
  
<div>
<div style="text-align:left">
	<%--角色列表 --%>
	<c:forEach items="${roleList}" var="o" varStatus="vs">
		<span style="padding:3px;">
		<%-- JSTL函数库,将用户有的角色被选中 contains：包含
			roleStr: 该用户所包含的角色字符串
			逻辑：如果用户的角色与当前列表的角色相同，则为选中的状态
		 --%>
		<input type="checkbox" name="roleIds" value="${o.roleId}" class="input"
		   <c:if test="${fn:contains(roleStr,o.name)}">checked</c:if>
		></input>
		${o.name}
		</span>
	</c:forEach>
</div>
</div>
</form>
</body>
</html>

