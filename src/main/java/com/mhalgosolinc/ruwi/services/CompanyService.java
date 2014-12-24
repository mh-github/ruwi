package com.mhalgosolinc.ruwi.services;

import java.util.List;

import com.mhalgosolinc.ruwi.entities.Company;
import com.mhalgosolinc.ruwi.formbeans.CompanyFormBean;

public interface CompanyService extends ruwiService {
	public void addCompany(CompanyFormBean companyFormBean);
	public List<Company> listCompanies();
}
