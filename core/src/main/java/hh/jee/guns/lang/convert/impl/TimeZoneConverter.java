package hh.jee.guns.lang.convert.impl;

import hh.jee.guns.lang.convert.AbstractConverter;

import java.util.TimeZone;


/**
 * TimeZone转换器
 * @author Looly, huahua
 *
 */
public class TimeZoneConverter extends AbstractConverter<TimeZone> {
	private static final long serialVersionUID = 1L;

	@Override
	protected TimeZone convertInternal(Object value) {
		return TimeZone.getTimeZone(convertToStr(value));
	}

}
