package structured.bridge;

/**
 * 扩展角色
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-13 10:21
 */
public class RefinedAbstraction extends AbstractionRole {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void impl() {
        System.out.println("调用 扩展角色实现方法");
        this.implementor.operationImpl();

    }
}
