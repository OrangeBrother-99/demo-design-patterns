package structured.flyweight.pureflyweight;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 16:13
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory instance = FlyweightFactory.getInstance();
        Flyweight a1 = instance.get("A");
        Flyweight a2 = instance.get("A");
        Flyweight a3 = instance.get("A");
        a1.operation();
        a2.operation();
        a3.operation();

    }
}
