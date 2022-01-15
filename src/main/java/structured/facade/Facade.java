package structured.facade;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 10:30
 */
public class Facade {

    private  SubClassA subClassA =new SubClassA();
    private  SubClassB subClassB=new SubClassB();
    private  SubClassC subClassC=new SubClassC();

    public  void  mothed(){
        subClassA.methodA();
        subClassB.methodB();
        subClassC.methodC();
    }
}

