package github.clyoudu.dpinj.factory.factorymethod;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:39
 * @description HyphenFormatterFactory
 */
public class HyphenFormatterFactory extends AbstractFormatterFactory {
    @Override
    public AbstractFormatter create() {
        return new HyphenFormatter();
    }
}
