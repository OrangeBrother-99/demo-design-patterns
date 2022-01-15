package structured.proxy;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-09 14:58
 */
public class OneSubject implements  Subject{
    @Override
    public Object request() {
        System.out.println("调用 OneSubject()...");
        return null;
    }
}
