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
		//�õ�declarations�������û��Ķ��� 
		/*List<Declaration> declarations = this.declarationService.findAllDeclaration();
		//�����û���declaration.getRoomid�õ��û������ķ������hotels
		List<Room> rooms = new ArrayList<Room>();
		if (declarations.size() > 0) {
			for (Declaration declaration : declarations) {
				rooms.add((Room) this.roomService.findRoomById(declaration
						.getRoomid()));
			}
		}
		//�����û������ķ���hotels��listAllHotel���棬��jsp����ȡ������ʾ 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listAllRoom", rooms);*/
		return SUCCESS;
	}
}