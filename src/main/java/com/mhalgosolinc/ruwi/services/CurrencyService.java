package com.mhalgosolinc.ruwi.services;

import java.util.List;

import com.mhalgosolinc.ruwi.entities.Currency;
import com.mhalgosolinc.ruwi.formbeans.CurrencyFormBean;

public interface CurrencyService extends ruwiService {
	public void addCurrency(CurrencyFormBean currencyFormBean);
	public List<Currency> listCurrencies();
}
