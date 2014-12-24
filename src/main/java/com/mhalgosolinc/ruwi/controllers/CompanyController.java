package com.mhalgosolinc.ruwi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mhalgosolinc.ruwi.entities.Company;
import com.mhalgosolinc.ruwi.formbeans.CompanyFormBean;
import com.mhalgosolinc.ruwi.services.CompanyService;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 * 
 */
@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(ModelMap model)
	{
		model.addAttribute("companyFormBean", new CompanyFormBean());
		return "company_add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCompany(ModelMap model,
			@Valid CompanyFormBean companyFormBean,
			BindingResult result)
	{
		if (result.hasErrors()) {
			model.addAttribute("companyFormBean", companyFormBean);
			model.addAttribute("result", result);
			return "company_add";
		} else {
			companyService.addCompany(companyFormBean);
			String message = "Company Successfully Added";
			model.addAttribute("message", message);
			return "common/add_success";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model)
	{
		List<Company> compList = companyService.listCompanies();
		model.addAttribute("compList", compList);
		return "company_list";
	}
}
