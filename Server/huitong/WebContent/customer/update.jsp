<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�޸��û�����</title>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red"><center>
					�޸��û�
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
							label="�û���" readonly="true"></s:textfield>

					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.identity_card" value="%{user.password}" label="����"></s:password>-->
						<s:textfield name="customer.identity_card" value="%{customer.identity_card}"
							label="���֤"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.identity_card" value="%{user.password}" label="����"></s:password>-->
						<s:textfield name="customer.bank_card" value="%{customer.bank_card}"
							label="���п�"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="customer.mobile" value="%{customer.mobile}"
							label="�ֻ�����"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="customer.email" value="%{customer.email}" label="�����ַ"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="�޸�"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>