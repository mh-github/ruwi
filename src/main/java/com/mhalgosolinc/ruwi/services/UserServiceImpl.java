/**
 * 
 */
package com.mhalgosolinc.ruwi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhalgosolinc.ruwi.dao.RoleDao;
import com.mhalgosolinc.ruwi.dao.UserDao;
import com.mhalgosolinc.ruwi.entities.Role;
import com.mhalgosolinc.ruwi.entities.User;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 * 
 */
@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Transactional
    public UserDetails loadUserByUsername(String userName)
    	throws UsernameNotFoundException, DataAccessException {

    	User user = userDao.getUserByUserName(userName);
    	if (user == null)
    		throw new UsernameNotFoundException(
    				"getUserByUserName returned null.");
    	else {
	    	List<Role> roles = roleDao.getRolesByUsername(userName);
	    	user.setUserAuthorities(roles);
    	}
    	return user;
    }
}
