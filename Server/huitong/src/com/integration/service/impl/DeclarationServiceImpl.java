package com.integration.service.impl;
import java.util.List;
import com.integration.entity.Declaration;
import com.integration.entity.Customer;
import com.integration.dao.DeclarationDAO;
import com.integration.service.DeclarationService;
public class DeclarationServiceImpl implements DeclarationService {
	private DeclarationDAO declarationDao;

	public DeclarationDAO getDeclarationDao() {
		return declarationDao;
	}
	public void setDeclarationDao(DeclarationDAO declarationDao) {
		this.declarationDao = declarationDao;
	}
	public List<Declaration> findAllDeclaration() {
		return this.declarationDao.findAllDeclaration();
	}
	public Declaration findDeclarationById(Integer id) {
		return this.declarationDao.findDeclarationById(id);
	}
	public void removeDeclaration(Declaration declaration) {
		this.declarationDao.removeDeclaration(declaration);
	}
	public void saveDeclaration(Declaration declaration) {
		this.declarationDao.saveDeclaration(declaration);
	}
	public void updateDeclaration(Declaration declaration) {
		this.declarationDao.updateDeclaration(declaration);
	}
	public List<Declaration> getCustomerDeclaration(Customer customer) {
		return this.declarationDao.getCustomerDeclaration(customer);
	}
}
