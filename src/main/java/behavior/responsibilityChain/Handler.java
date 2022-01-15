package behavior.responsibilityChain;

/**
 * 抽象处理器
 *
 * @author chen hao
 * @version 1.0
 * @date 2022-01-11 16:45
 */
public abstract class Handler {

    private Handler next;

    /**
     * 是否有能力处理
     */
    public abstract boolean isAbleHandle(String b);
    /**
     * 处理过程
     */
    public abstract void processHandle(String b);

    /**
     * 设置下个执行器
     */
    void setNext(Handler handler) {
        this.next = handler;
    }

    /**
     * 获取下个执行器
     */
    Handler getNext() {
        return next;
    }
}
