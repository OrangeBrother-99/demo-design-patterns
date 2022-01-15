package behavior.strategy;

/**
 * 策略接口
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-15 16:13
 */
public interface Strategy {

    /**
     * 策略方法
     */
    String method(String args);

    /*
    // 当使用迭代器模式+策略模式时 使用
    boolean check(String args);*/
}
