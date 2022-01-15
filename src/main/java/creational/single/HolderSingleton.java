package creational.single;

/**
 * 处理器  单例
 * 优点： 通过将实例对象放在内部类中 利用类加载机制 当访问了 Holder时 才初始化
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-08-03 14:57
 */
public class HolderSingleton {
     private  byte[]  data =new byte[1024];

     private  HolderSingleton(){
     }

     private  static  class Holder{
         private  static  HolderSingleton instance =new HolderSingleton();

         public  static  HolderSingleton getInstance(){
             return instance;
         }

     }
}
