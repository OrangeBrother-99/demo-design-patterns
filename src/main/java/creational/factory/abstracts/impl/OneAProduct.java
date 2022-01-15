package creational.factory.abstracts.impl;

import creational.factory.abstracts.AProduct;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 10:42
 */
public class OneAProduct implements AProduct {
    @Override
    public void show() {
        System.out.println("OneAProduct");
    }
}
