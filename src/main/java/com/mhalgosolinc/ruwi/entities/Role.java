/**
 * 
 */
package com.mhalgosolinc.ruwi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 * The persistent class for the ROLES database table.
 */
@Entity
@Table(name = "ROLES")
public class Role {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "ROLE")
	private String role;
	
	// getters and setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}
