package com.mhalgosolinc.ruwi.formbeans;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class CurrencyFormBean {

	@NotEmpty
	@Size(min=3, max=3)
	private String code;
	
	@NotEmpty
	private String description;

	// constructor
	public CurrencyFormBean() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
