package creational.builder;

/**
 * 指挥建造者
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-08 15:50
 */
public class Director {

 private  Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public  Product construct(){
        builder.buildProductA();
        builder.buildProductB();
        builder.buildProductC();
        builder.buildProductD();
        return builder.getResult();
    }
}
