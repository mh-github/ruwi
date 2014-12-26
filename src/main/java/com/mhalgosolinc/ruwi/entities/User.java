/**
 * 
 */
package com.mhalgosolinc.ruwi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 * 
 * The persistent class for the USERS database table.
 */
@Entity
@Table(name = "USERS")
public class User implements Serializable, UserDetails {
	private static final long serialVersionUID = 1L;
	
	// Original props
	@Id
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "ENABLED")
	private Boolean enabled;

	@Column(name = "EMAIL")
	private String email;
	
	// Getters & Setters for properties
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Spring Security props
	private transient Collection<GrantedAuthority> authorities;

	// UserDetails methods
	@Transient
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Transient
	public boolean isAccountNonExpired() {
		return true;
	}

	@Transient
	public boolean isAccountNonLocked() {
		return true;
	}

	@Transient
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Transient
	public boolean isEnabled() {
		return getEnabled();
	}

	public void setUserAuthorities(Collection<Role> roles) {
		List<GrantedAuthority> listOfAuthorities = new ArrayList<GrantedAuthority>();
		for (Role role : roles) {
			listOfAuthorities.add(new GrantedAuthorityImpl(role.getRole()));
		}
		this.authorities = (Collection<GrantedAuthority>) listOfAuthorities;
	}
	// Constructors
	public User() {
	}
}