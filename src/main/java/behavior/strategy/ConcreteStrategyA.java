package behavior.strategy;

/**
 * 具体策略实现
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-15 16:15
 */
public class ConcreteStrategyA  implements  Strategy{
    @Override
    public String method(String args) {
        System.out.println("invoke ConcreteStrategyA: ");
        return args+"A";
    }
}
