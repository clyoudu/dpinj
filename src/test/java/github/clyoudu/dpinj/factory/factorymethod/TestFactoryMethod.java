package github.clyoudu.dpinj.factory.factorymethod;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:50
 * @description TestFactoryMethod
 */
public class TestFactoryMethod {

    @Test
    public void test(){
        String text = "factory method test";
        CamelFormatterFactory camelFormatterFactory = new CamelFormatterFactory();
        HyphenFormatterFactory hyphenFormatterFactory = new HyphenFormatterFactory();
        UnderscoreFormatterFactory underscoreFormatterFactory = new UnderscoreFormatterFactory();

        System.out.println(transform(camelFormatterFactory, text));
        System.out.println(transform(hyphenFormatterFactory, text));
        System.out.println(transform(underscoreFormatterFactory, text));
    }

    private String transform(AbstractFormatterFactory factory, String text){
        return factory.create().transform(text);
    }

}
