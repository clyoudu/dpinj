package github.clyoudu.dpinj.factory.factorymethod;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:39
 * @description CamelFormatterFactory
 */
public class CamelFormatterFactory extends AbstractFormatterFactory {
    @Override
    public AbstractFormatter create() {
        return new CamelFormatter();
    }
}
