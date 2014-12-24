/**
 * 
 */
package com.mhalgosolinc.ruwi.dao;

import java.util.List;

import com.mhalgosolinc.ruwi.entities.Role;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 */
public interface RoleDao {
	List<Role> getRolesByUsername(String userName);
	public void create(Role role);
}
