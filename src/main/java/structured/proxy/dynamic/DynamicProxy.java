package structured.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 在前面介绍的代理模式中，代理类中包含了对真实主题的引用，这种方式存在两个缺点。
 * 真实主题与代理主题一一对应，增加真实主题也要增加代理。
 * 设计代理以前真实主题必须事先存在，不太灵活。采用动态代理模式可以解决以上问题
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-09 15:14
 */
public class DynamicProxy  implements InvocationHandler {

    private  Object  object;

    public DynamicProxy(Object object) {
        this.object = object;
    }
    @Override
    public  Object invoke(Object o, Method method,Object[] args)  {
        try {
            method.invoke(object,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
