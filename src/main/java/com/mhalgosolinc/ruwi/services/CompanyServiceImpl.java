package com.mhalgosolinc.ruwi.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhalgosolinc.ruwi.dao.CompanyDao;
import com.mhalgosolinc.ruwi.entities.Address;
import com.mhalgosolinc.ruwi.entities.Company;
import com.mhalgosolinc.ruwi.formbeans.CompanyFormBean;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	@Transactional
	public void addCompany(CompanyFormBean companyFormBean) {
		
		Company company = new Company();
		company.setName(companyFormBean.getName());
		company.setDate_incorporated(companyFormBean.getDate_incorporated());
		Address address = new Address();
		address.setStreetDetails1(companyFormBean.getStreetDetails1());
		address.setStreetDetails2(companyFormBean.getStreetDetails2());
		address.setCity(companyFormBean.getCity());
		address.setState(companyFormBean.getState());
		company.setAddress(address);
		
		companyDao.add(company);
	}

	@Transactional
	public List<Company> listCompanies()
	{
		return companyDao.list();
	}
}
