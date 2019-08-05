<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<ul>
			<c:set var="aaa" value=""/>
			<!-- 遍历用户对应的所有模块集合 -->
			<c:forEach items="${_CURRENT_USER}" var="module">
				<%-- 如果该模块是对应要查询的左侧菜单所属模块，并且该模块的类型为主菜单即输出，否则不输出
					 也就是货物管理就输出货运管理，对应的系统管理就只输出系统管理
				 --%>
	            <c:if test="${(moduleName eq module.remark) and module.ctype==1}">
		               <c:if test="${ fn:contains(aaa,module.cpermission) eq false  }">
	                      <c:set var="aaa" value="${aaa},${module.cpermission}"/>
	                      <li><a href="${ctx}/${module.curl}" onclick="linkHighlighted(this)" target="main" id="aa_1">${module.cpermission}</a></li>
	                  </c:if>  
	            </c:if>
			</c:forEach>
</ul>