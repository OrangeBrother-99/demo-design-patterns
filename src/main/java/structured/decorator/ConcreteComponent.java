package structured.decorator;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-15 10:36
 */
public class ConcreteComponent implements  Component{
    public ConcreteComponent() {
    }

    @Override
    public void display() {
        System.out.println("原始数据");
    }
}
