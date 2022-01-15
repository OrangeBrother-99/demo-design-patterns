package structured.adapter.adapter.twoway;

/**
 * 模式的应用场景
 * 适配器模式（Adapter）通常适用于以下场景。
 * 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
 * 使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
 * 模式的扩展
 * 适配器模式（Adapter）可扩展为双向适配器模式，双向适配器类既可以把适配者接口转换成目标接口，也可以把目标接口转换成适配者接口，其结构图如图 4 所示。
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 17:31
 */
public class TwoWayAdapter {
    private  Adaptee adaptee;
    private  Target target;

    public TwoWayAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public TwoWayAdapter(Target target) {
        this.target = target;
    }

    public  void request(){
        adaptee.specificRequest();
    }
    public  void specificRequest(){
        target.request();
    }
}

