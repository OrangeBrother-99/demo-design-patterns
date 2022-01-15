package creational.factory.abstracts;

import creational.factory.abstracts.impl.TwoFactory;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 15:41
 */
public class Test {
    public static void main(String[] args) {
        Factory one= new TwoFactory();
        one.markAProduct().show();
        one.markBProduct().show();
    }
}
