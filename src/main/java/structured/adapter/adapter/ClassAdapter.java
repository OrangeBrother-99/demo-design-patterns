package structured.adapter.adapter;

/**
 * 类 适配器
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 16:57
 */
public class ClassAdapter extends  Adaptee implements  Target {

    @Override
    public void request() {
        doInvoke();
    }
}
