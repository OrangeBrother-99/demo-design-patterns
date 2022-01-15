package creational.factory.abstracts.impl;

import creational.factory.abstracts.BProduct;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 10:42
 */
public class TwoBProduct implements BProduct {
    @Override
    public void show() {
        System.out.println("TwoBProduct");
    }
}
