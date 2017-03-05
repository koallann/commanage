package br.edu.ifal.commanage.bo;

import br.edu.ifal.commanage.model.Company;
import br.edu.ifal.commanage.model.Purchase;
import br.edu.ifal.commanage.util.exception.CompanyBOException;
import java.sql.SQLException;

public class CompanyBOPurchase {
	
	private Company company;
	
	public CompanyBOPurchase (Company company) {
		this.company = company;
	}
	
	/* public int getPurchaseQuantity(){
		return company.getPurchaseQuantity();
	} */
	
	public void validateAddPurchase (Purchase purchase) throws CompanyBOException, SQLException {
		if (purchase.getProductId() != 0 && purchase.getQuantity() > 0)
			company.addPurchase(purchase);
		else
			throw new CompanyBOException("Invalid purchase");
	}
	
	/* public boolean removePurchase (Purchase purchase) throws CompanyBOException {
		return company.removePurchase(purchase);
	} */
}