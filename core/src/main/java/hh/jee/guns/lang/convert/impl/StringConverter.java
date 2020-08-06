package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;

/**
 * 字符串转换器
 * @author Looly, huahua
 *
 */
public class StringConverter extends AbstractConverter<String> {
	private static final long serialVersionUID = 1L;

	@Override
	protected String convertInternal(Object value) {
		return convertToStr(value);
	}

}
