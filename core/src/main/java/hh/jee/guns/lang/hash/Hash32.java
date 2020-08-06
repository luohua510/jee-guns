package hh.jee.guns.lang.hash;

/**
 * Hash计算接口
 *
 * @param <T> 被计算hash的对象类型
 * @author looly, huahua
 */
@FunctionalInterface
public interface Hash32<T> {
	/**
	 * 计算Hash值
	 *
	 * @param t 对象
	 * @return hash
	 */
	int hash32(T t);
}