package structured.bridge.adapter;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-13 10:42
 */
public abstract class ObjectAdapter {
    protected  Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public ObjectAdapter() {

    }

    public  void  impl(){
        adaptee.specificRequest();
    }
}
