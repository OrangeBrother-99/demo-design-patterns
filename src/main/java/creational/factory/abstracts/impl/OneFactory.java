package creational.factory.abstracts.impl;

import creational.factory.abstracts.AProduct;
import creational.factory.abstracts.BProduct;
import creational.factory.abstracts.Factory;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-07 14:06
 */
public class OneFactory implements Factory {
    @Override
    public AProduct markAProduct() {
        return new OneAProduct();
    }

    @Override
    public BProduct markBProduct() {
        return new OneBProduct();
    }
}
