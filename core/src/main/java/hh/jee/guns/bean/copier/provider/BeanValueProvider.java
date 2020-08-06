package hh.jee.guns.bean.copier.provider;

import hh.jee.guns.bean.BeanDesc;
import hh.jee.guns.bean.BeanUtil;
import hh.jee.guns.bean.copier.ValueProvider;
import hh.jee.guns.lang.convert.Convert;
import hh.jee.guns.lang.exception.UtilException;
import hh.jee.guns.util.StringUtil;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Bean的值提供者
 * 
 * @author looly, huahua
 *
 */
public class BeanValueProvider implements ValueProvider<String> {

	private final Object source;
	private final boolean ignoreError;
	final Map<String, BeanDesc.PropDesc> sourcePdMap;

	/**
	 * 构造
	 * 
	 * @param bean Bean
	 * @param ignoreCase 是否忽略字段大小写
	 * @param ignoreError 是否忽略字段值读取错误
	 */
	public BeanValueProvider(Object bean, boolean ignoreCase, boolean ignoreError) {
		this.source = bean;
		this.ignoreError = ignoreError;
		sourcePdMap = BeanUtil.getBeanDesc(source.getClass()).getPropMap(ignoreCase);
	}

	@Override
	public Object value(String key, Type valueType) {
		BeanDesc.PropDesc sourcePd = sourcePdMap.get(key);
		if(null == sourcePd && (Boolean.class == valueType || boolean.class == valueType)) {
			//boolean类型字段字段名支持两种方式
			sourcePd = sourcePdMap.get(StringUtil.upperFirstAndAddPre(key, "is"));
		}

		Object result = null;
		if (null != sourcePd) {
			final Method getter = sourcePd.getGetter();
			if (null != getter) {
				try {
					result = getter.invoke(source);
				} catch (Exception e) {
					if (false == ignoreError) {
						throw new UtilException(e, "Inject [{}] error!", key);
					}
				}

				result = Convert.convertWithCheck(valueType,result, null, ignoreError);
			}
		}
		return result;
	}

	@Override
	public boolean containsKey(String key) {
		return sourcePdMap.containsKey(key) || sourcePdMap.containsKey(StringUtil.upperFirstAndAddPre(key, "is"));
	}

}
