package github.clyoudu.dpinj.factory.factorymethod;

import org.apache.commons.lang3.StringUtils;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:38
 * @description CamelFormatter
 */
public class CamelFormatter extends AbstractFormatter {
    @Override
    public String transform(String text) {
        String[] words = words(text);
        if(words != null){
            for (int i = 0; i < words.length; i++) {
                words[i] = firstCharUpperCase(words[i]);
            }
        }
        return StringUtils.join(words, "");
    }
}
