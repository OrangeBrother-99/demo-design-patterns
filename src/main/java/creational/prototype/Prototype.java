package creational.prototype;

/**
 * 原型模式的应用场景
 * 原型模式通常适用于以下场景。
 * 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 创建对象成本较大，例如初始化时间长，占用CPU太多，或者占用网络资源太多等，需要优化资源。
 * 创建一个对象需要繁琐的数据准备或访问权限等，需要提高性能或者提高安全性。
 * 系统中大量使用该类对象，且各个调用者都需要给它的属性重新赋值。
 * @author chen hao
 * @version 1.0
 * @date 2021-09-06 17:33
 */
public interface Prototype extends   Cloneable {

    public  Object clone();

    public  void  print();



}
