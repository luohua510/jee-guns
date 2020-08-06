package hh.jee.guns.lang.convert.impl;

import hh.jee.guns.lang.convert.AbstractConverter;
import hh.jee.guns.util.CharsetUtil;

import java.nio.charset.Charset;

/**
 * 编码对象转换器
 * @author Looly, huahua
 *
 */
public class CharsetConverter extends AbstractConverter<Charset> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Charset convertInternal(Object value) {
		return CharsetUtil.charset(convertToStr(value));
	}

}
