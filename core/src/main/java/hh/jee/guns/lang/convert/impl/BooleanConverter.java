package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;
import hh.jee.guns.util.BooleanUtil;

/**
 * 布尔转换器
 * @author Looly, huahua
 *
 */
public class BooleanConverter extends AbstractConverter<Boolean> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Boolean convertInternal(Object value) {
		//Object不可能出现Primitive类型，故忽略
		return BooleanUtil.toBoolean(convertToStr(value));
	}

}
