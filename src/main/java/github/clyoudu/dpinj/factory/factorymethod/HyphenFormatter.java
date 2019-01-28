package github.clyoudu.dpinj.factory.factorymethod;

import org.apache.commons.lang3.StringUtils;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:38
 * @description HyphenFormatter
 */
public class HyphenFormatter extends AbstractFormatter {
    @Override
    public String transform(String text) {
        return StringUtils.join(words(text), "-");
    }
}
