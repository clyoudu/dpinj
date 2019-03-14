package github.clyoudu.dpinj.interpreter.parser;

import github.clyoudu.dpinj.interpreter.exception.OrafileParseException;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/8 9:37
 * @description OraFileParserContext
 */
public class OraFileParserContext {

    private final static Set<Character> NETWORK_CHAR_SET = new HashSet<>(Arrays.asList(
            '(',')','<','>','/','\\',
            ',','.',':',';','\'','"','=','-','_',
            '$','+','*','#','&','!','%','?','@',
            '0','1','2','3','4','5','6','7','8','9',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
    ));

    private StringTokenizer tokenizer;

    private String currentToken;

    public OraFileParserContext(String content) {
        if(StringUtils.isBlank(content)){
            throw new OrafileParseException("null content!");
        }
        content = preProcess(content);

        tokenizer = new StringTokenizer(content, "\n=()",true);
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("error：" + currentToken + " interpreter error!");
        }
        nextToken();
    }

    /**
     * delete comments
     * @param content
     * @return
     */
    private String preProcess(String content) {
        content = content.replaceAll("\r\n", "\n");
        List<String> list = new ArrayList<>();
        String[] tmp = content.split("\n");
        for (String line : tmp) {
            if(StringUtils.isNotBlank(line) && !(line = line.trim()).startsWith("#")) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if(c == '#' && line.charAt(i - 1) != '\\'){
                        line = line.substring(0, i);
                        break;
                    }
                }
                for (int i = 0; i < line.length(); i++) {
                    Character character = line.charAt(i);
                    if(!NETWORK_CHAR_SET.contains(character) && character != ' '){
                        throw new OrafileParseException("error value: " + line + " for character " + character + "...");
                    }
                }
                list.add(line.replaceAll("\\\\\\(","[")
                        .replaceAll("\\\\\\)","]").replaceAll("\\\\=", "|"));
            }
        }
        return StringUtils.join(list, "\n");
    }
}
