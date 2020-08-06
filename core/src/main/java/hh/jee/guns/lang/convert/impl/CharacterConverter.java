package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;
import hh.jee.guns.util.BooleanUtil;
import hh.jee.guns.util.StringUtil;

/**
 * 字符转换器
 * 
 * @author Looly, huahua
 *
 */
public class CharacterConverter extends AbstractConverter<Character> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Character convertInternal(Object value) {
		if (value instanceof Boolean) {
			return BooleanUtil.toCharacter((Boolean) value);
		} else {
			final String valueStr = convertToStr(value);
			if (StringUtil.isNotBlank(valueStr)) {
				return valueStr.charAt(0);
			}
		}
		return null;
	}

}
