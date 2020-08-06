package hh.jee.guns.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring IOC 上下文工具
 *
 * @Author huahua
 * @Date 2020/5/2 08:43
 * @Version 1.0
 */
public class ContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    public ContextUtil(){}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 从Spring 容器中获取Bean
     *
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanName){
        return (T) context.getBean(beanName);
    }


}
