package com.mhalgosolinc.ruwi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhalgosolinc.ruwi.entities.Currency;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 */
@Repository
public class CurrencyDaoImpl implements CurrencyDao {

		@Autowired 
		private SessionFactory sessionFactory;
		
		/* (non-Javadoc)
		 * @see com.mhalgosolinc.oneprofiles.dao.GeneralProfileDao#create(com.mhalgosolinc.oneprofiles.entities.GeneralProfile)
		 */
		public void add(Currency currency) {
			sessionFactory.getCurrentSession().save(currency);
		}
		
		public List<Currency> list()
		{
			List<Currency> currList = new ArrayList<Currency>();
			currList = sessionFactory.getCurrentSession().createCriteria(Currency.class).list();
			return currList;
		}
}
