package behavior.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 环境管理器 当无法感知具体执行那个策略时 通过迭代器模式+策略模式
 * 匹配符合的策略
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-15 16:26
 */
public class ContextManager {
    private static final List<Strategy> STRATEGIES = new ArrayList<>();

    public ContextManager() {
        STRATEGIES.add(new ConcreteStrategyA());
        STRATEGIES.add(new ConcreteStrategyB());
    }

    public boolean addStrategy(Strategy strategy) {
        if (STRATEGIES.contains(strategy)) {
            return false;
        }
        return STRATEGIES.add(strategy);
    }

    public static String invoke(String msg) {

        for (Strategy strategy : STRATEGIES) {
            //策略接口 可添加判断条件方法
            /*if (strategy.check(msg)){
            //do some thing  执行业务代码
            }*/
            return strategy.method(msg);
        }
        return "";
    }
}
