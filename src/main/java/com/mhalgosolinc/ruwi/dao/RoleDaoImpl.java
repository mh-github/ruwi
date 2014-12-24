/**
 * 
 */
package com.mhalgosolinc.ruwi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhalgosolinc.ruwi.entities.Role;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 */
@Repository
public class RoleDaoImpl implements RoleDao {

	@Autowired 
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mhalgosolinc.oneprofiles.dao.RoleDao#getRolesByUsername(java.lang.String)
	 */
	public List<Role> getRolesByUsername(String userName) {

		return (List<Role>) sessionFactory.getCurrentSession()
				.createQuery("from Role r where r.username = :un")
				.setParameter("un", userName)
				.list();
	}

	public void create(Role role) {
    	sessionFactory.getCurrentSession().save(role);
    }
}
