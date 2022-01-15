package structured.flyweight.pureflyweight;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 16:04
 */
public class ConcreteFlyweightA implements Flyweight{

    private String  key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ConcreteFlyweightA(String key) {
        System.out.println("初始化 key:"+key);
        this.key = key;
    }

    @Override
    public void operation() {
        System.out.println("调用 ConcreteFlyweightA");
    }
}
