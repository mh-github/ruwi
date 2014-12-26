/**
 * 
 */
package com.mhalgosolinc.ruwi.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhalgosolinc.ruwi.entities.GeneralProfile;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 */
@Repository
public class GeneralProfileDaoImpl implements GeneralProfileDao {

	@Autowired 
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mhalgosolinc.oneprofiles.dao.GeneralProfileDao#create(com.mhalgosolinc.oneprofiles.entities.GeneralProfile)
	 */
	public void create(GeneralProfile generalProfile) {
		sessionFactory.getCurrentSession().save(generalProfile);
	}

}
