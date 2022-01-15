package structured.decorator;

/**
 * 抽象装饰
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-15 10:37
 */
public class ConcreateDecorator extends   Decorator{
    public ConcreateDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        addFunction();
    }

    public  void addFunction(){
        System.out.println("附加功能");
    }
}
