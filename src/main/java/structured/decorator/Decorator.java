package structured.decorator;

/**
 * 抽象装饰
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-15 10:37
 */
public class Decorator  implements  Component{
    private  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
