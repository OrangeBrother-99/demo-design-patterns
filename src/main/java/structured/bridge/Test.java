package structured.bridge;

import structured.bridge.adapter.Adaptee;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-13 10:36
 */
public class Test {

    public static void main(String[] args) {

        Implementor concreteImplementor = new ConcreteImplementor(new Adaptee());
        AbstractionRole abstractionRole = new RefinedAbstraction(concreteImplementor);
        abstractionRole.impl();
    }
}
