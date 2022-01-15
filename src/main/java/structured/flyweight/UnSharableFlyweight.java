package structured.flyweight;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-16 15:33
 */
public class UnSharableFlyweight {
    private String info;

    public UnSharableFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
