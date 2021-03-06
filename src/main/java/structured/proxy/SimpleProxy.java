package structured.proxy;

/**
 代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，
 代理对象作为访问对象和目标对象之间的中介。

 代理模式的主要优点有：
 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
 代理对象可以扩展目标对象的功能；
 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度，增加了程序的可扩展性

 其主要缺点是：
 代理模式会造成系统设计中类的数量增加
 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
 增加了系统的复杂度；
 那么如何解决以上提到的缺点呢？答案是可以使用动态代理方式 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-09 14:56
 */
public  class SimpleProxy  implements  Subject{

    private  OneSubject  oneSubject;

    public void preRequest(){
        System.out.println(" preRequest 执行");
    }

    @Override
    public Object request() {
        if (oneSubject==null){
            oneSubject =new OneSubject();
        }
        preRequest();
        oneSubject.request();
        postRequest();
        System.out.println("执行完毕...");
        return null;
    }
    public void postRequest(){
        System.out.println(" postRequest 执行");
    }

}
