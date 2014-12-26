package com.mhalgosolinc.ruwi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhalgosolinc.ruwi.dao.CurrencyDao;
import com.mhalgosolinc.ruwi.entities.Currency;
import com.mhalgosolinc.ruwi.formbeans.CurrencyFormBean;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	private CurrencyDao currencyDao;
	
	@Transactional
	public void addCurrency(CurrencyFormBean currencyFormBean) {
		
		Currency currency = new Currency();
		currency.setCode(currencyFormBean.getCode());
		currency.setDescription(currencyFormBean.getDescription());
		
		currencyDao.add(currency);
	}

	@Transactional
	public List<Currency> listCurrencies()
	{
		return currencyDao.list();
	}
}
