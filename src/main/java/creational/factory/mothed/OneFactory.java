package creational.factory.mothed;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 10:13
 */
public class OneFactory implements  Factory {

    @Override
    public Product markProduct() {
        return new OneProduct() ;
    }
}
