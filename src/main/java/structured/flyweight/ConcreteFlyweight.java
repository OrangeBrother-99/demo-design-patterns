package structured.flyweight;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 15:33
 */
public class ConcreteFlyweight implements  Flyweight{
    private  Character key;

    public ConcreteFlyweight(Character key) {
        this.key = key;
        System.out.println("初始化享元数据 key："+key);
    }

    public Character getKey() {
        return key;
    }
    public void setKey(Character key) {
        this.key = key;
    }

    @Override
    public void operation(UnSharableFlyweight sharableFlyweight) {
        System.out.print("保存的非享元对象：");
        System.out.println("-->"+sharableFlyweight.getInfo());
    }
}
