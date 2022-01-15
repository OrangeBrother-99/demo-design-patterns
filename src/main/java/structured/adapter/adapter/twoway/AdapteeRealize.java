package structured.adapter.adapter.twoway;

/**
 * 适配者实现
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 17:28
 */
public class AdapteeRealize  implements  Adaptee{
    @Override
    public void specificRequest() {
        System.out.println("AdapteeRealize");
    }
}
