package structured.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 15:44
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');


        Flyweight a1 = flyweightFactory.compositeFactory(compositeState);
        Character character ='d';
        Flyweight sd = flyweightFactory.factory(character);

        a1.operation(new UnSharableFlyweight("第一次调用A1"));
        a1.operation(new UnSharableFlyweight("第二次调用A1"));

        sd.operation(new UnSharableFlyweight("第一次调用sd"));
        sd.operation(new UnSharableFlyweight("第二次调用sd"));

    }
}
