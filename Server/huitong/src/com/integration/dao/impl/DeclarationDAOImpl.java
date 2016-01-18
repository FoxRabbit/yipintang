package com.integration.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.integration.entity.Declaration;
import com.integration.entity.Customer;
import com.integration.dao.DeclarationDAO;
public class DeclarationDAOImpl extends HibernateDaoSupport implements DeclarationDAO {
	@SuppressWarnings("unchecked")
	public List<Declaration> findAllDeclaration() {
		String hql = "from Declaration ord declaration by ord.declaration_id desc";
		return (List<Declaration>) this.getHibernateTemplate().find(hql);
	}
	public Declaration findDeclarationById(Integer id) {
		return (Declaration) this.getHibernateTemplate().get(Declaration.class, id);
	}
	public void removeDeclaration(Declaration declaration) {
		this.getHibernateTemplate().delete(declaration);
	}
	public void saveDeclaration(Declaration declaration) {
		this.getHibernateTemplate().save(declaration);
	}
	public void updateDeclaration(Declaration declaration) {
		this.getHibernateTemplate().update(declaration);
	}
	@SuppressWarnings("unchecked")
	public List<Declaration> getCustomerDeclaration(Customer customer) {
		String hql = "from Declaration ord where ord.customer_id='" + customer.getCustomer_id()
				+ "'";
		return (List<Declaration>) this.getHibernateTemplate().find(hql);
	}
}
