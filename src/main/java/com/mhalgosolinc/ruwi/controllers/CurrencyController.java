package com.mhalgosolinc.ruwi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mhalgosolinc.ruwi.entities.Currency;
import com.mhalgosolinc.ruwi.formbeans.CurrencyFormBean;
import com.mhalgosolinc.ruwi.services.CurrencyService;

/**
 * @author mhussain at {@link http://bit.ly/mahboob}
 * 
 */
@Controller
@RequestMapping("/currency")
public class CurrencyController {
	
	public static final Logger LOG = Logger.getLogger(CurrencyController.class.getName());
	@Autowired
	private CurrencyService currencyService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(ModelMap model)
	{
		model.addAttribute("currencyFormBean", new CurrencyFormBean());
		return "currency_add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCurrency(ModelMap model,
			@Valid CurrencyFormBean currencyFormBean,
			BindingResult result)
	{
		if (result.hasErrors()) {
			model.addAttribute("currencyFormBean", currencyFormBean);
			model.addAttribute("result", result);
			return "currency_add";
		} else {
			currencyService.addCurrency(currencyFormBean);
			String message = "Currency Successfully Added";
			model.addAttribute("message", message);
			return "common/add_success";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model)
	{
		List<Currency> currList = currencyService.listCurrencies();
		model.addAttribute("currList", currList);
		LOG.info("currency list size = " + Integer.toString(currList.size()));
		return "currency_list";
	}
}
