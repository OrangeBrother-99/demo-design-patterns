package behavior.responsibilityChain;

/**
 * 处理器管理者
 * @author chen hao
 * @version 1.0
 * @date 2022-01-11 16:56
 */
public class HandlerManager {

    public static void doProcess(Handler handler, String s) {
        boolean hasNext = true;
        while (hasNext) {
            boolean result = handler.isAbleHandle(s);
            if (result) {
                handler.processHandle(s);
                hasNext = false;
            } else {
                handler = handler.getNext();
                if (handler == null) {
                    System.out.println("无法处理该任务！" + s);
                    hasNext =false;
                }
            }
        }
    }
}
