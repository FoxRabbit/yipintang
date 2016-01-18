<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>修改用户资料</title>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red"><center>
					修改用户
				</center> </font>
		</h1>
		<s:form action="updateCustomer">
			<table>
				<tr>
					<td>
						<s:hidden name="customer.customer_id" value="%{customer.customer_id}"></s:hidden>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="customer.customername" value="%{customer.customername}"
							label="用户名" readonly="true"></s:textfield>

					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.identity_card" value="%{user.password}" label="密码"></s:password>-->
						<s:textfield name="customer.identity_card" value="%{customer.identity_card}"
							label="身份证"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.identity_card" value="%{user.password}" label="密码"></s:password>-->
						<s:textfield name="customer.bank_card" value="%{customer.bank_card}"
							label="银行卡"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="customer.mobile" value="%{customer.mobile}"
							label="手机号码"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="customer.email" value="%{customer.email}" label="邮箱地址"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="修改"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>