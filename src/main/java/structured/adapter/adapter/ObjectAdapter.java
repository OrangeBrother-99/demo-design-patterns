package structured.adapter.adapter;

/**
 * 类 适配器
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 16:57
 */
public class ObjectAdapter  implements  Target {

    private  Adaptee  adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doInvoke();
    }
}
