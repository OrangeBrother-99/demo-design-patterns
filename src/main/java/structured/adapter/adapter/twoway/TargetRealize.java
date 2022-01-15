package structured.adapter.adapter.twoway;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-11 17:29
 */
public class TargetRealize implements Target{
    @Override
    public void request() {
        System.out.println("TargetRealize");
    }
}

