<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>收支项目管理--修改</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript" src="js/common.js"></script>
<script type="text/javascript">
function myform(){
	alert("再到李开复离职的恐惧");
}

</script>
</head>

<body leftmargin="0" topmargin="0" onLoad="MM_preloadImages('images/login_10.gif','images/login_12.gif','images/login_09.gif','images/login_11.gif')">
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="32" align="left" valign="top" class="text006"><table width="98%"  border="0" cellspacing="0" cellpadding="0">
        <tr valign="top">
          <td>【 收支项目管理 】</td>
          <td align="right">&nbsp;</td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td height="215" valign="top"><table width="98%"  border="0" cellspacing="0" cellpadding="0">
      <tr align="left" class="bg03">
        <td width="100%" height="29">
          <span class="text001">&nbsp;&nbsp;修改收支项目</span></td>
        </tr>

    </table>
      <table width="98%"  border="0" cellpadding="0" cellspacing="0" class="text008">
        <tr align="center">
          <td width="12%" height="35" align="right">收支类型</td>
          <td width="88%" align="left"><span class="text010">
            <select name="select" class="inp005" id="inex">
            
            <c:forEach var='inex' items='${allIncomeToExpense}'>
            <option value='<c:out value="${inex.incomeExpenID }"></c:out>'>
            <c:out  value="${inex.incomeExpenName }"></c:out>  
            </option>
            </c:forEach>
            
            </select>
          </span></td>
        </tr>
        <tr align="center" class="bg04">
          <td height="35" align="right">父项目</td>
          <td align="left">
          	<select name="select" class="inp005" onclick="myshow()" id='superType'>
              <c:forEach var='supertype' items='${allSuperType}'>
            	<option value='<c:out value="${supertype.accountSuperTypeID }"></c:out>' >
            	<c:out value="${supertype.accountSuperTypeName }"></c:out>   </option>
            
            	</c:forEach>
            </select>
          </td>
        </tr>
        <tr align="center">
          <td height="35" align="right">项目名称</td>
          <td align="left"><input name="textfield" type="text" class="inp001" 
          value='${subtype.accountSubTypeName }' /></td>
        
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="0" cellspacing="0" class="bor001">
        <tr>
          <td width="22%" height="40" align="center" >
          <a href="/familyaccount/SaveEditAccountTypeServlet?" onclick="myform()" target="mainframe" onMouseOver="MM_swapImage('Image1','','images/index_12_1.gif',1)" onMouseOut="MM_swapImgRestore()" onMouseDown="MM_swapImage('Image1','','images/index_12_2.gif',1)" onMouseUp="MM_swapImage('Image1','','images/index_12_1.gif',1)"><img src="images/index_12_0.gif" name="Image1" width="75" height="24" border="0" id="Image1"></a>&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="/familyaccount/ListAccountTypeServlet"  target="mainframe" onMouseOver="MM_swapImage('Image2','','images/login_09.gif',1)" onMouseOut="MM_swapImgRestore()" onMouseDown="MM_swapImage('Image2','','images/login_11.gif',1)" onMouseUp="MM_swapImage('Image2','','images/login_09.gif',1)"><img src="images/login_07.gif" name="Image2" width="75" height="24" border="0" id="Image2"></a></td>
          <td width="78%" align="right">&nbsp;</td>
        </tr>
      </table></td>
  </tr>
</table>
</body>
</html>
