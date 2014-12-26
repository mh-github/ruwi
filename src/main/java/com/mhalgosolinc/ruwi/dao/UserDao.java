/**
 * 
 */
package com.mhalgosolinc.ruwi.dao;

import com.mhalgosolinc.ruwi.entities.User;

public interface UserDao {
	public User getUserByUserName(String userName);
	public void create(User user);
	public String checkUserAvailability(String userName);
}