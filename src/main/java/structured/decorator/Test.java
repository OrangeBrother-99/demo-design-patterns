package structured.decorator;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 10:15
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreateDecorator concreateDecorator = new ConcreateDecorator(component);
        concreateDecorator.display();
    }
}
