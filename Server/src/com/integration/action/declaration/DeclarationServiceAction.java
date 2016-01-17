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
	// 得到用户所预定的房间
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		//得到declarations的当前用户的订单 
		/*HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		List<Declaration> declarations = this.declarationService.getCustomerDeclaration(customer);
		//根据用户的declaration.getRoomid得到用户所定的房间存入hotels
		List<Room> rooms = new ArrayList<Room>();
		if (declarations.size() > 0) {
			for (Declaration declaration : declarations) {
				rooms.add((Room)this.roomService.findRoomById(declaration
						.getRoomid()));
			}
		}
		//保存用户所定的房间hotels到listCustomerHotel里面，在jsp里面取出来显示 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listCustomerRoom", rooms);*/
		return SUCCESS;
	}
	// 退订
	public String delete() {
		/*HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		// 删除订单
		Declaration declaration = this.declarationService.findDeclarationByCustomeridAndRoomid(customer
				.getCustomerid(), room.getRoomid());
		this.declarationService.removeDeclaration(declaration);
		// 设置房间为空，无客人
		Room roomCustomer = this.roomService.findRoomById(room.getRoomid());
		roomCustomer.setStatus(0);
		this.roomService.updateRoom(roomCustomer);
		message = "退订房间成功。";*/
		return "delSuc";
	}
}