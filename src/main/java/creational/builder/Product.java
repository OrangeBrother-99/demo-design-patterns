package creational.builder;

/**
 * 产品
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-08 15:43
 */
public class Product {
    private    String   productA;
    private    String   productB;
    private    String   productC;
    private    String   productD;

    public void setProductA(String productA) {
        this.productA = productA;
    }

    public void setProductB(String productB) {
        this.productB = productB;
    }

    public void setProductC(String productC) {
        this.productC = productC;
    }

    public void setProductD(String productD) {
        this.productD = productD;
    }
    
    public void show(){
        System.out.println("产品构建完成 细节如下");
        System.out.println(this);
    }
}
