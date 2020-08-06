package hh.jee.guns.lang.convert.impl;

import hh.jee.guns.lang.convert.AbstractConverter;
import hh.jee.guns.util.BooleanUtil;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * {@link AtomicBoolean}转换器
 * 
 * @author Looly, huahua
 */
public class AtomicBooleanConverter extends AbstractConverter<AtomicBoolean> {
	private static final long serialVersionUID = 1L;

	@Override
	protected AtomicBoolean convertInternal(Object value) {
		if (boolean.class == value.getClass()) {
			return new AtomicBoolean((boolean) value);
		}
		if (value instanceof Boolean) {
			return new AtomicBoolean((Boolean) value);
		}
		final String valueStr = convertToStr(value);
		return new AtomicBoolean(BooleanUtil.toBoolean(valueStr));
	}

}
