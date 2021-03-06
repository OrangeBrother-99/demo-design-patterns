package creational.single;

/**
 * ζζ±εδΎ
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-08-03 14:39
 */

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }
    public  static  synchronized LazySingleton getInstance(){
        if (instance ==null)
        {
            instance =new LazySingleton();
        }
        return  instance;
    }


}
