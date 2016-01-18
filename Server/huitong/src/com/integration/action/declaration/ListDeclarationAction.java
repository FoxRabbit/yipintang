package com.integration.action.declaration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Declaration;
import com.integration.service.DeclarationService;
@SuppressWarnings("serial")
public class ListDeclarationAction extends ActionSupport {
	private Declaration declaration;
	private DeclarationService declarationService;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		//得到declarations的所有用户的订单 
		/*List<Declaration> declarations = this.declarationService.findAllDeclaration();
		//根据用户的declaration.getRoomid得到用户所定的房间存入hotels
		List<Room> rooms = new ArrayList<Room>();
		if (declarations.size() > 0) {
			for (Declaration declaration : declarations) {
				rooms.add((Room) this.roomService.findRoomById(declaration
						.getRoomid()));
			}
		}
		//保存用户所定的房间hotels到listAllHotel里面，在jsp里面取出来显示 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listAllRoom", rooms);*/
		return SUCCESS;
	}
}