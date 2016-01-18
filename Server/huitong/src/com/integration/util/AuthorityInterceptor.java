package com.integration.util;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.integration.entity.Customer;
@SuppressWarnings("serial")
public class AuthorityInterceptor extends AbstractInterceptor {
	@Override
	//��¼������
	public String intercept(ActionInvocation invocation) throws Exception {	
		ActionContext context = invocation.getInvocationContext();	
		Map session = context.getSession();		
		Customer customer = (Customer)session.get("customer");		
		if(customer!=null){
			return invocation.invoke();
		}		
		context.put("message", "����û�е�¼�����¼ϵͳ��");		
		return Action.LOGIN;
	}
}
