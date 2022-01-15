package structured.flyweight.pureflyweight;



import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 16:02
 */
public class FlyweightFactory {
    private  static FlyweightFactory instance=new FlyweightFactory();
    private ConcurrentHashMap<String, Flyweight> dataMap=new ConcurrentHashMap<>();

    public  static FlyweightFactory getInstance(){
        return instance;
    }

    public Flyweight get(String key){
        Flyweight flyweight = dataMap.get(key);
        if (null != flyweight){
            System.out.println("享元数据已经存在："+key);
            return  flyweight;
        }
        flyweight = new ConcreteFlyweightA(key);
        dataMap.put(key,flyweight);
        return flyweight;
    }
}
