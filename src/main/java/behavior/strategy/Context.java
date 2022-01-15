package behavior.strategy;

/**
 *   环境
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-15 16:21
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String invoke(String args) {
        String method = strategy.method(args);
        System.out.println("invoke result: "+method);
        return method;
    }
}
