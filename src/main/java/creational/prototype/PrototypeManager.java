package creational.prototype;

import java.util.HashMap;

/**
 * 原型管理器
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-06 17:33
 */
public  class PrototypeManager {
    private static final HashMap<String ,Prototype>  hp=new HashMap<>();

    public PrototypeManager() {
        /**可以  采用包扫描 子类实现 进行注册*/
        hp.put(TestOnePrototype.class.getName(),new TestOnePrototype());
        hp.put(TestTwoPrototype.class.getName(),new TestTwoPrototype());
    }

    public  Prototype get(String name){
        Prototype prototype =(Prototype) hp.get(name).clone();
        return prototype;
    }

    public     void set(String name,Prototype prototype){
        hp.put(name,prototype);
    }
}

