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
		// 判断房间是否开放
		/*Room roomCustomer = this.roomService.findRoomById(room.getRoomid());
		if (roomCustomer.getStatus() == 0) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			Customer customer = (Customer) session.getAttribute("customer");
			declaration.setCustomerid(customer.getCustomerid());
			// 预定
			this.declarationService.saveDeclaration(declaration);
			// 设置房间为满（有客人）
			roomCustomer.setStatus(1);
			this.roomService.updateRoom(roomCustomer);
			return "addSuc";
		} else {
			message = "该房间已经有客人入住了。";
			return "addFail";
		}*/
		return "addSuc";
	}
}