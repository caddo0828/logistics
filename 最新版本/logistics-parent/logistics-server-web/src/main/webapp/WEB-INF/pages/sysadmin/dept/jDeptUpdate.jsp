<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<script type="text/javascript">
		function checkNumber() {
			var state = document.getElementById("state").value;
			var reg_state = /^(0|1){1}$/;
			if(!reg_state.test(state)) {
				document.getElementById("error").innerHTML="当前部门状态只能为1或0";
				return false;
			}else {
				formSubmit('deptAction_update','_self');this.blur();
			}
		}
	</script>
	
</head>

<body>
<form name="icform" method="post">
      <input type="hidden" name="deptId" value="${d.deptId}"/>
      
<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>

<li id="save"><a href="#" onclick="return checkNumber();">保存</a></li>
<li id="back"><a href="#" onclick="history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="${ctx}/skin/default/images/icon/currency_yen.png"></img>
   修改部门
  </div> 
  
  <div>
	<table class="commonTable" cellspacing="1">
	 <tr>
	     <td class="columnTitle">上级部门：</td>
	        <td class="tableContent">	
	          <select name="parentId">
	           	   <option value="">---请选择---</option>
	           	   <c:forEach items="${list}"  var="dept">
		        		<option value="${dept.deptId}"  <c:if test="${dept.deptName==d.parentName}">selected</c:if>>${dept.deptName}</option>
		    		</c:forEach>
	    	</select>
	   	   </td>
	</tr>		
	<tr>
	    <td class="columnTitle">部门名称：</td>
	    <td class="tableContent"><input type="text" name="deptName" value="${d.deptName}"/></td>
    </tr>	
    <tr>
    	<td class="columnTitle">部门状态</td>
    	<td class="tableContent"><input type="text" id="state" name="state" value="${d.state}"/><span id="error" style="color: red; font-size=14px;"></span></td>
    </tr>	
	</table>
 </div>
 </form>
</body>
</html>