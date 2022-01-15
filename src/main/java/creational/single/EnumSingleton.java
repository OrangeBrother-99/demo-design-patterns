package creational.single;

/**
 * 枚举单例
 * 优点： 通过枚举类型 不许继承特点保证了防止外部破坏单例， 同样是线程安全的、且只能被实例化一次
 * 缺点：不能够懒加载
 * @author chen hao
 * @version 1.0
 * @date 2021-08-03 15:51
 */
public class EnumSingleton {
   private  byte[] data =new byte[1024];

   private  EnumSingleton(){}

    private  enum  EnumHolder{
       INSTANCE;
       private  EnumSingleton enumSingleton;

       EnumHolder(){
           this.enumSingleton=new EnumSingleton();
       }

       private EnumSingleton getEnumSingleton (){
           return  enumSingleton;
       }

       public  static  EnumSingleton getInstance(){
           return  EnumHolder.INSTANCE.getEnumSingleton();
       }
    }
}
