package behavior.responsibilityChain;

/**
 * 具体处理器1
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-11 16:49
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public boolean isAbleHandle(String b) {
        return b.equals("two");
    }

    @Override
    public void processHandle(String b) {
        System.out.println("ConcreteHandler2 处理：" + b);
    }
}
