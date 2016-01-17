package com.integration.dao;
import java.util.List;
import com.integration.entity.Declaration;
import com.integration.entity.Customer;
public interface DeclarationDAO {
	public void saveDeclaration(Declaration declaration);
	public List<Declaration> findAllDeclaration();
	public void removeDeclaration(Declaration declaration);
	public void updateDeclaration(Declaration declaration);
	public Declaration findDeclarationById(Integer id);
	public List<Declaration> getCustomerDeclaration(Customer customer);
}
