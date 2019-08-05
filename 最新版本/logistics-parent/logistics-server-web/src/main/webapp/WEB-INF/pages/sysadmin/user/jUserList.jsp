<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<script>
	     function isOnlyChecked(){
	    	 var checkBoxArray = document.getElementsByName('userId');
				var count=0;
				for(var index=0; index<checkBoxArray.length; index++) {
					if (checkBoxArray[index].checked) {
						count++;
					}	
				} 
			//jquery
			//var count = $("[input name='id']:checked").size();
			if(count==1) {
				return true;
			}else {
				return false;
			}
	     }
	     
	     function toCheck(url,location) {
	    	 if(isOnlyChecked()){
	    		 formSubmit(url,location);
	    	 }else{
	    		 alert("请先选择一项并且只能选择一项，再进行操作！");
	    	 }
	     }

	</script>
</head>

<body>
<form name="icform" method="post">
<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="view"><a href="#" onclick="javascript:toCheck('userAction_toview','_self');">查看</a></li>
<li id="new"><a href="#" onclick="formSubmit('userAction_tocreate','_self');this.blur();">新增</a></li>
<li id="update"><a href="#" onclick="javascript:toCheck('userAction_toupdate','_self');">修改</a></li>
<li id="update"><a href="#" onclick="javascript:toCheck('userAction_torole','_self');">角色</a></li>
<li id="delete"><a href="#" onclick="formSubmit('userAction_delete','_self');this.blur();">删除</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
<div class="textbox" id="centerTextbox">
  <div class="textbox-header">
  <div class="textbox-inner-header">
  <div class="textbox-title">
     用户列表
  </div> 
  </div>
  </div>
  
<div>

<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr >
		<td class="tableHeader" ><input type="checkbox" name="selid" onclick="checkAll('userId',this)"></td>
		<td class="tableHeader" >序号</td>
		<td class="tableHeader" >编号</td>
		<td class="tableHeader" >用户名</td>
		<td class="tableHeader" >真实姓名</td>
		<td class="tableHeader" >状态</td>
		<td class="tableHeader">用户创建日期</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	${pageUtils.links}
	
	<c:forEach items="${pageUtils.results}" var="user" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td><input type="checkbox" name="userId" value="${user.userId}"/></td>
		<td>${status.index+1}</td>
		<td>${user.userId}</td>
		<td><a href="userAction_toview?id=${user.userId}">${user.userName}</a></td>
		<%--用户详细信息名 --%>
		<td>${user.name}</td> 
		<td>${user.state}</td>
		<td><fmt:formatDate value='${user.createTime}' pattern='yyyy-MM-dd hh:mm:ss'/></td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

