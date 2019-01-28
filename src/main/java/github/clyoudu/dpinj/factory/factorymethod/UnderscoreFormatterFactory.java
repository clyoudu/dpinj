package github.clyoudu.dpinj.factory.factorymethod;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:40
 * @description UnderscoreFormatterFactory
 */
public class UnderscoreFormatterFactory extends AbstractFormatterFactory {
    @Override
    public AbstractFormatter create() {
        return new UnderscoreFormatter();
    }
}
