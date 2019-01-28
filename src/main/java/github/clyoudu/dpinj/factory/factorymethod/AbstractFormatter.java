package github.clyoudu.dpinj.factory.factorymethod;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 14:35
 * @description AbstractFormatter
 */
public abstract class AbstractFormatter {

    private final static String NORMAL_SEPARATOR = "\\s+|-|_";

    public static String[] words(String text){
        if(text == null){
            return null;
        }
        String[] stage1 = text.split(NORMAL_SEPARATOR);
        if(stage1.length > 1){
            return stage1;
        }

        List<String> result = new ArrayList<>();
        int start = 0;
        for(int i = 1; i < text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                result.add(text.substring(start, i));
                start = i;
            }
        }
        if(start < text.length()){
            result.add(text.substring(start, text.length()));
        }
        return result.toArray(new String[result.size()]);
    }

    protected String firstCharUpperCase(String text){
        if(StringUtils.isBlank(text)){
            return "";
        }
        if(text.length() == 1){
            return text.toUpperCase();
        }

        return text.substring(0,1).toUpperCase() + text.substring(1, text.length()).toLowerCase();
    }

    public abstract String transform(String text);

}
