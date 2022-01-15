package structured.bridge;

/**
 * 抽象角色
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-13 10:20
 */
public abstract class AbstractionRole {

     protected   Implementor implementor;

     public  AbstractionRole(Implementor implementor){
         this.implementor=implementor;
     }

     abstract  void  impl();
}
