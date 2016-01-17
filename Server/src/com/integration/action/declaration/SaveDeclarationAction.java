package com.integration.action.declaration;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Declaration;
import com.integration.entity.Customer;
import com.integration.service.DeclarationService;
@SuppressWarnings("serial")
public class SaveDeclarationAction extends ActionSupport {
	private Declaration declaration;
	private Customer customer;
	private DeclarationService declarationService;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Declaration getDeclaration() {
		return declaration;
	}
	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}
	public DeclarationService getDeclarationService() {
		return declarationService;
	}
	public void setDeclarationService(DeclarationService declarationService) {
		this.declarationService = declarationService;
	}
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		//request.put("listRoom", this.roomService.findAllRoom());
		return SUCCESS;
	}
	public String add() {
		// �жϷ����Ƿ񿪷�
		/*Room roomCustomer = this.roomService.findRoomById(room.getRoomid());
		if (roomCustomer.getStatus() == 0) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			Customer customer = (Customer) session.getAttribute("customer");
			declaration.setCustomerid(customer.getCustomerid());
			// Ԥ��
			this.declarationService.saveDeclaration(declaration);
			// ���÷���Ϊ�����п��ˣ�
			roomCustomer.setStatus(1);
			this.roomService.updateRoom(roomCustomer);
			return "addSuc";
		} else {
			message = "�÷����Ѿ��п�����ס�ˡ�";
			return "addFail";
		}*/
		return "addSuc";
	}
}