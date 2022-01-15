package structured.bridge;

import structured.bridge.adapter.Adaptee;
import structured.bridge.adapter.ObjectAdapter;

/**
 * 具体实现化接口
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-13 10:22
 */
public class ConcreteImplementor extends ObjectAdapter implements Implementor  {
    public ConcreteImplementor() {
        super();
    }

    public ConcreteImplementor(Adaptee adaptee) {
        super(adaptee);
    }

    @Override
    public void operationImpl() {
        System.out.println("调用具体实现化接口");
        this.adaptee.specificRequest();

    }
}
