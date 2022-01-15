package behavior.responsibilityChain;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-11 17:14
 */
public class TestChain {
    public static void main(String[] args) {

        String  s ="three";
        Handler one = new ConcreteHandler1();
        Handler two = new ConcreteHandler2();
        one.setNext(two);
        HandlerManager.doProcess(one,s);
    }
}
