<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>收支项目管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript" src="js/common.js"></script>
<script type="text/javascript">

</script>
</head>

<body topmargin="0" leftmargin="0">
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="32" align="left" valign="top" class="text006"><table width="98%"  border="0" cellspacing="0" cellpadding="0">
        <tr valign="top">
          <td>【 收支项目管理 】 (父项目名称)</td>
          <td align="right">
          <a href="add.jsp"  onMouseOver="MM_swapImage('Image1','','images/index_15_1.gif',1)" onMouseOut="MM_swapImgRestore()" onMouseDown="MM_swapImage('Image1','','images/index_15_2.gif',1)" onMouseUp="MM_swapImage('Image1','','images/index_15_1.gif',1)"><img src="images/index_15_0.gif" width="85" height="24" border="0" align="top" id="Image1"></a>&nbsp;&nbsp;
          <a href="add1.jsp"  onMouseOver="MM_swapImage('Image2','','images/index_14_1.gif',1)" onMouseOut="MM_swapImgRestore()" onMouseDown="MM_swapImage('Image2','','images/index_14_2.gif',1)" onMouseUp="MM_swapImage('Image2','','images/index_15_1.gif',1)"><img src="images/index_14_0.gif" width="85" height="24" border="0" align="top" id="Image2"></a>&nbsp;&nbsp;
          <a href="#"   onMouseOver="MM_swapImage('Image3','','images/index_13_1.gif',1)" onMouseOut="MM_swapImgRestore()" onMouseDown="MM_swapImage('Image3','','images/index_13_2.gif',1)" onMouseUp="MM_swapImage('Image3','','images/index_13_1.gif',1)"><img src="images/index_13_0.gif" id="Image3" width="75" height="24" border="0"></a>
		  </td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td height="215" valign="top"><table width="98%"  border="0" cellspacing="0" cellpadding="0">
      <tr align="center" class="bg03">
        <td width="13%" height="29">
          <input type="checkbox" name="checkbox" value="checkbox"> 
          <span class="text007">全选</span></td>
        <td width="22%" class="text007"> 收支类型              </td>
        <td width="20%" class="text007">项目名称 </td>
        <td width="30%" class="text007">操作</td>
      </tr>
      
      <c:forEach var='type' items='${limitAcconut}'>
       <tr align="center">
        <td height="35"><input type="checkbox" name="checkbox" value="checkbox"></td>
        
        <td><c:out   value='${type.accountSuperType.incomeToExpensesType.incomeExpenName}'></c:out>    </td>
        <td align="left" align="center"><a href="/familyaccount/DetailAccountTypeServlet?id=${type.accountSubTypeID }" ><c:out value='${type.accountSubTypeName}'></c:out>     </a></td>
        <td><a href="/familyaccount/DetailAccountTypeServlet?id=${type.accountSubTypeID }" ><img src="images/icon_resault.gif" alt="查 看" width="12" height="15" hspace="10" border="0"></a>
        	<a href="/familyaccount/EditAccountTypeServlet?id=${type.accountSubTypeID }"><img src="images/icon_set.gif" alt="编 辑" width="14" height="15" border="0"></a>
        	<a href="#"><img src="images/delete.gif" alt="删 除" width="13" height="16" hspace="10"></a></td>
      </tr>
      </c:forEach>
      
      
      
      
      
      
      
      
      
      
      
      
      
     
         
        

    </table>
      <table width="98%" border="0" cellpadding="0" cellspacing="0" class="bor001">
        <tr>
          <td height="40" align="left" >&nbsp;</td>
          <td align="right">
          </td>
        </tr>
      </table></td>
  </tr>
</table>
</body>
</html>
