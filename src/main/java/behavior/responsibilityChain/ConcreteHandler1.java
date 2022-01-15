package behavior.responsibilityChain;

/**
 * 具体处理器1
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-11 16:49
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public boolean isAbleHandle(String b) {
        return b.equals("one");
    }

    @Override
    public void processHandle(String b) {
        System.out.println("ConcreteHandler1 处理：" + b);
    }
}
