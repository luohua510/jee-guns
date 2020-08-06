package hh.jee.guns.lang.convert;


import hh.jee.guns.util.ExceptionUtil;
import hh.jee.guns.util.StringUtil;

/**
 * 转换异常
 * @author xiaoleilu,huahua
 */
public class ConvertException extends RuntimeException{
	private static final long serialVersionUID = 4730597402855274362L;

	public ConvertException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}
	
	public ConvertException(String message) {
		super(message);
	}
	
	public ConvertException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}
	
	public ConvertException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public ConvertException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
