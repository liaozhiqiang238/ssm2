<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <script type="text/javascript">
               function num(PageIndex){
                     document.getElementById("PageIndex").value=PageIndex;
                     document.getElementById("fo").submit();
               }
        </script>        

     	<link type="text/css" rel="stylesheet" href="css/style.css" />
     	${sc}
         <div>
             <form action="${pageContext.request.contextPath}/fye" method="post"  id="fo">
                  用户名:<input type="text" name=“loginName”  value="${user.loginName }">
                  姓名:<input type="text" name=“userName” >
                  性别:<input type="radio" name="sex"  value="1">男<input type="radio" name="sex"   value="0">女
                  电话:<input type="text" name="mobile">
                  <input type="hidden" name="pageIndex" id="PageIndex">
                  <input type="submit" value="搜索">
             </form>
         </div>
		<div class="m_right">
            <p></p>           
            <div class="mem_tit">详细信息</div>  
            <table border="0" class="order_tab" style="width:920px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
            <c:forEach items="${pagebean.list}" var="cart" varStatus="status"> 
              <tr>                                                                                                                                                    
                <td width="25%">${cart.loginName}</td>
                <td width="25%">${cart.userName}</td>
                <td width="20%">${cart.sex==1?"男":"女"}</td>
                <td width="30%">${cart.mobile}</td> 
                <td><a href="">修改</a><a href="${pageContext.request.contextPath}/scc/${cart.id}">删除</a></td>                
              </tr>                      
            </c:forEach>
            </table>   
             <a href="javascript:;" onclick="num(${1})">首页</a>  
             <a href="javascript:;" onclick="num(${pagebean.pageIndex-1})">上一页</a>                 
             <a href="javascript:;" onclick="num(${pagebean.pageIndex+1})">下一页</a> 
             <a href="javascript:;" onclick="num(${pagebean.pageCount})">尾页</a><br/>                           
        </div>
    