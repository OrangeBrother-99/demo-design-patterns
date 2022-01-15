package structured.proxy.dynamic;

import structured.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 10:02
 */
public class Test {
    public static void main(String[] args) {

        Subject  subject =null;
        InvocationHandler invocationHandler =null;
        invocationHandler =new DynamicProxy(new RealSubjectB());
        subject= (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[]{Subject.class},invocationHandler);
        subject.request();
    }
}
