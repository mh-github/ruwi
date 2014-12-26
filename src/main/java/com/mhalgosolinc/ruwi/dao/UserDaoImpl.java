/**
 * 
 */
package com.mhalgosolinc.ruwi.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhalgosolinc.ruwi.entities.User;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 * 
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public User getUserByUserName(String userName) {
		return (User) sessionFactory.getCurrentSession()
				.createQuery("from User u where u.username = :un")
				.setParameter("un", userName).uniqueResult();
	}

	public void create(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	/*
	 * @author kiranmayi check user name existence in user table
	 * 
	 * @param String
	 * 
	 * @return boolean
	 */
	public String checkUserAvailability(String userName) {
		String result = "FAIL";
		List resultList = null;

		try {
			resultList = sessionFactory.getCurrentSession()
					.createQuery("from User u where upper(username) = :userName")
					.setParameter("userName", userName.toUpperCase()).list();
			boolean exists = (resultList != null && resultList.size() > 0);
			if (exists)
				result = "SUCCESS";

		} catch (HibernateException e) {
			e.printStackTrace();
			result = "ERROR";
		}
		return result;
	}
}
