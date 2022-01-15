package structured.flyweight.composite;

import structured.flyweight.Flyweight;
import structured.flyweight.UnSharableFlyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 16:21
 */
public class CompositeConcreteFlyweight implements Flyweight {
    private ConcurrentHashMap<Character ,Flyweight> map=new ConcurrentHashMap<>();
    @Override
    public void operation(UnSharableFlyweight sharableFlyweight) {
          map.forEach((k,v)->v.operation(sharableFlyweight));
    }
    public  void put(Character character,Flyweight flyweight){
        map.put(character,flyweight);
    }

}
