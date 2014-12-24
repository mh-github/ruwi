/**
 * 
 */
package com.mhalgosolinc.ruwi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 *
 * The persistent class for GENERAL_PROFILE database table
 */
@Entity
@Table(name = "GENERAL_PROFILE")
public class GeneralProfile implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "FULL_NAME")
	private String fullname;
	
	@Column(name = "DATEOFBIRTH")
	private Date dateofbirth;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "FATHERS_NAME")
	private String fathersname;
	
	@Column(name = "MOBILE_NUMBER")
	private Integer mobilenumber;

	@Column(name = "MOTHERS_NAME")
	private String mothersname;
	
	@Column(name = "ADDRESS")
	private String address;
	
	// constructor
	public GeneralProfile() {

	}
	
	// getters and setters for properties
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFathersname() {
		return fathersname;
	}
	
	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}
	
	public Integer getMobilenumber() {
		return mobilenumber;
	}
	
	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getMothersname() {
		return mothersname;
	}

	public void setMothersname(String mothersname) {
		this.mothersname = mothersname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}