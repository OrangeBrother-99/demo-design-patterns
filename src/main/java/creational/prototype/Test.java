package creational.prototype;

/**
 * 测试类
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-06 17:46
 */
public class Test {
    public static void main(String[] args) {
         PrototypeManager pm =new PrototypeManager();
        Prototype prototype = pm.get(TestOnePrototype.class.getName());
        prototype.print();
        Prototype prototype2 = pm.get(TestTwoPrototype.class.getName());
        prototype2.print();
    }
}
