package com.mhalgosolinc.ruwi.dao;

import java.util.List;

import com.mhalgosolinc.ruwi.entities.Company;

public interface CompanyDao {
	public void add(Company company);
	public List<Company> list();
}
