package creational.prototype;

/**
 * 子类实现 原型
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-06 17:34
 */
public class TestTwoPrototype  implements Prototype {
    @Override
    public  Object clone() {
        TestTwoPrototype clone=null;
        try {
            clone = (TestTwoPrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝失败");
        }
        return clone ;
    }

    @Override
    public void print() {
        System.out.println("two 实现cloneAble");
    }
}
