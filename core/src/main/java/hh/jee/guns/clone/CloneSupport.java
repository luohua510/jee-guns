package hh.jee.guns.clone;

/**
 * 克隆支持类，提供默认的克隆方法
 * @author Looly, huahua
 *
 * @param <T> 继承类的类型
 */
public class CloneSupport<T> implements java.lang.Cloneable {
	
	@SuppressWarnings("unchecked")
	@Override
	public T clone() {
		try {
			return (T) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new CloneRuntimeException(e);
		}
	}
	
}
