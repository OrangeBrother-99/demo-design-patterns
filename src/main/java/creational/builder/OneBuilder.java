package creational.builder;

/**
 * 具体构建类
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-08 15:47
 */
public class OneBuilder extends  Builder{
    @Override
    public void buildProductA() {
        product.setProductA("创建a产品");
    }

    @Override
    public void buildProductB() {
        product.setProductB("创建b产品");
    }

    @Override
    public void buildProductC() {
        product.setProductC("创建c产品");
    }

    @Override
    public void buildProductD() {
        product.setProductD("创建d产品");
    }


}
