package structured.proxy.dynamic;

import structured.proxy.Subject;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-09 15:14
 */
public class RealSubjectA implements Subject  {
    @Override
    public Object request() {
        System.out.println("调用 RealSubjectA ");
        return null;
    }
}
