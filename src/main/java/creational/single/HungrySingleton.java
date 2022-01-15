package creational.single;

/**
 * 饿汉式
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-08-03 14:46
 */
public class HungrySingleton {
    private static  final HungrySingleton   instance =new HungrySingleton();

    private HungrySingleton() {
    }

    public  static  HungrySingleton getInstance(){
        return instance;
    }
}
