package com.mhalgosolinc.ruwi.dao;

import java.util.List;

import com.mhalgosolinc.ruwi.entities.Currency;

public interface CurrencyDao {
	public void add(Currency currency);
	public List<Currency> list();
}
