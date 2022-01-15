package structured.flyweight;

import structured.flyweight.composite.CompositeConcreteFlyweight;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 15:34
 */
public class FlyweightFactory {
    private ConcurrentHashMap<Character, Flyweight> dataMap = new ConcurrentHashMap<>();

    public Flyweight factory(Character key) {
        Flyweight flyweight = dataMap.get(key);
        if (null != flyweight) {
            System.out.println("享元数据已经存在：" + key);
            return flyweight;
        }
        flyweight = new ConcreteFlyweight(key);
        dataMap.put(key, flyweight);
        return flyweight;
    }


    public Flyweight compositeFactory(List<Character> characters) {
        CompositeConcreteFlyweight concreteFlyweight = new CompositeConcreteFlyweight();
        characters.forEach(v -> concreteFlyweight.put(v, this.factory(v)));
        return concreteFlyweight;
    }

}
