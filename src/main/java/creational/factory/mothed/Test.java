package creational.factory.mothed;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 10:15
 */
public class Test {
    public static void main(String[] args) {
        Factory factory =new TwoFactory();
        factory.markProduct().show();
    }
}
