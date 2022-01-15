package creational.single;

/**
 * 双重检查 单例
 * 弊端 ： 多线程下 实例还未被初始化完毕 已经返回 导致返回null 或者未初始化完的实例、
 * @author chen hao
 * @version 1.0
 * @date 2021-08-03 14:50
 */
public class DoubleCheckSingle {
    /**实例变量**/
    private   byte[]  data =new byte[1024];

    private static  DoubleCheckSingle instance =null;

    private   DoubleCheckSingle() {
    }

    public  static  DoubleCheckSingle getInstance(){
        if (null ==instance){
            synchronized (DoubleCheckSingle.class){
                if (null== instance){
                   instance =new DoubleCheckSingle();
                }
            }
        }
        return instance;
    }
}
