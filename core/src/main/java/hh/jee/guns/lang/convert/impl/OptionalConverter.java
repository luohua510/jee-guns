package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;

import java.util.Optional;

/**
 * 
 * {@link Optional}对象转换器
 * 
 * @author Looly, huahua
 */
public class OptionalConverter extends AbstractConverter<Optional<?>> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Optional<?> convertInternal(Object value) {
		return Optional.ofNullable(value);
	}

}
