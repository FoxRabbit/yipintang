package com.integration.action.declaration;
import java.util.ArrayList;
import java.util.List;
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
public class DeclarationServiceAction extends ActionSupport {
	private DeclarationService declarationService;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public DeclarationService getDeclarationService() {
		return declarationService;
	}
	public void setDeclarationService(DeclarationService declarationService) {
		this.declarationService = declarationService;
	}
	// �õ��û���Ԥ���ķ���
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		//�õ�declarations�ĵ�ǰ�û��Ķ��� 
		/*HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		List<Declaration> declarations = this.declarationService.getCustomerDeclaration(customer);
		//�����û���declaration.getRoomid�õ��û������ķ������hotels
		List<Room> rooms = new ArrayList<Room>();
		if (declarations.size() > 0) {
			for (Declaration declaration : declarations) {
				rooms.add((Room)this.roomService.findRoomById(declaration
						.getRoomid()));
			}
		}
		//�����û������ķ���hotels��listCustomerHotel���棬��jsp����ȡ������ʾ 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listCustomerRoom", rooms);*/
		return SUCCESS;
	}
	// �˶�
	public String delete() {
		/*HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		// ɾ������
		Declaration declaration = this.declarationService.findDeclarationByCustomeridAndRoomid(customer
				.getCustomerid(), room.getRoomid());
		this.declarationService.removeDeclaration(declaration);
		// ���÷���Ϊ�գ��޿���
		Room roomCustomer = this.roomService.findRoomById(room.getRoomid());
		roomCustomer.setStatus(0);
		this.roomService.updateRoom(roomCustomer);
		message = "�˶�����ɹ���";*/
		return "delSuc";
	}
}