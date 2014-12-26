package com.mhalgosolinc.ruwi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhalgosolinc.ruwi.entities.Company;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {

		@Autowired 
		private SessionFactory sessionFactory;
		
		/* (non-Javadoc)
		 * @see com.mhalgosolinc.oneprofiles.dao.GeneralProfileDao#create(com.mhalgosolinc.oneprofiles.entities.GeneralProfile)
		 */
		public void add(Company company) {
			sessionFactory.getCurrentSession().save(company);
		}
		
		public List<Company> list()
		{
			List<Company> compList = new ArrayList<Company>();
			compList = sessionFactory.getCurrentSession().createCriteria(Company.class).list();
			return compList;
		}
}
