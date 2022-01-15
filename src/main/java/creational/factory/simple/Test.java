package creational.factory.simple;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 10:04
 */
public class Test {
    public static void main(String[] args) {
        Product product = SimpleFactory.markProduct(SimpleFactory.Constant.ONE);
        product.show();
    }
}
