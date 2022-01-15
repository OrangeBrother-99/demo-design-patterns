package creational.builder;

/**
 * TODO
 *
 * @author chen hao
 * @version 1.0
 * @date 2021-09-08 15:53
 */
public class Test {
    public static void main(String[] args) {

        OneBuilder oneBuilder = new OneBuilder();
        Director director = new Director(oneBuilder);
        Product construct = director.construct();
        construct.show();
    }
}
