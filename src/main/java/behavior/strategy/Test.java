package behavior.strategy;

/**
 * 测试类
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-15 16:23
 */
public class Test {
    public static void main(String[] args) {
        // 单策略模式 测试
        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        Context context = new Context(strategyB);
        context.invoke("AAA");
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.invoke("BBB");
        //输出结果：
        /**
         invoke ConcreteStrategyB:
         invoke result: AAAB
         invoke ConcreteStrategyA:
         invoke result: BBBA
        * */

        //策略模式 + 迭代器模式
        //ContextManager.invoke("CCC");

    }
}
