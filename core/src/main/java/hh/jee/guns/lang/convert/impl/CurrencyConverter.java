package hh.jee.guns.lang.convert.impl;

import hh.jee.guns.lang.convert.AbstractConverter;

import java.util.Currency;

/**
 * 货币{@link Currency} 转换器
 * 
 * @author Looly, huahua
 */
public class CurrencyConverter extends AbstractConverter<Currency> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Currency convertInternal(Object value) {
		return Currency.getInstance(convertToStr(value));
	}

}
