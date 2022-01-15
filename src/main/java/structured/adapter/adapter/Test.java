package structured.adapter.adapter;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 17:01
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("类适配器 ：");
        Target target = new ClassAdapter();
        target.request();
        System.out.println("对象适配器 ：");
        Adaptee adaptee = new Adaptee();
        new ObjectAdapter(adaptee).request();

    }
}
