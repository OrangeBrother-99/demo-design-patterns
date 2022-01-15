package structured.adapter.adapter.twoway;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 17:33
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("目标 通过双向适配器访问 适配者");
        AdapteeRealize adapteeRealize = new AdapteeRealize();
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(adapteeRealize);
        twoWayAdapter.request();
        System.out.println("适配者 通过双向适配器访问 目标 ");
        TargetRealize targetRealize = new TargetRealize();
        twoWayAdapter =new TwoWayAdapter(targetRealize);
        twoWayAdapter.specificRequest();
    }
}
