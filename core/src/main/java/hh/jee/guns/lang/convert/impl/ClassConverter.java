package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;
import hh.jee.guns.util.ClassUtil;

/**
 * 类转换器<br>
 * 将类名转换为类
 * @author Looly, huahua
 *
 */
public class ClassConverter extends AbstractConverter<Class<?>> {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected Class<?> convertInternal(Object value) {
		String valueStr = convertToStr(value);
		try {
			return ClassUtil.getClassLoader().loadClass(valueStr);
		} catch (Exception e) {
			// Ignore Exception
		}
		return null;
	}

}
