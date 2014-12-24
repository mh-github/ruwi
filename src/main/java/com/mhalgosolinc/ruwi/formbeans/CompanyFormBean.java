package com.mhalgosolinc.ruwi.formbeans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.mhalgosolinc.ruwi.entities.Currency;

public class CompanyFormBean {

	private String name;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date date_incorporated;
	private String streetDetails1;
	private String streetDetails2;
	private String city;
	private String state;
	private int zip;
	private String country;
	private Currency currency;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_incorporated() {
		return date_incorporated;
	}

	public void setDate_incorporated(Date date_incorporated) {
		this.date_incorporated = date_incorporated;
	}

	public String getStreetDetails1() {
		return streetDetails1;
	}

	public void setStreetDetails1(String streetDetails1) {
		this.streetDetails1 = streetDetails1;
	}

	public String getStreetDetails2() {
		return streetDetails2;
	}

	public void setStreetDetails2(String streetDetails2) {
		this.streetDetails2 = streetDetails2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
