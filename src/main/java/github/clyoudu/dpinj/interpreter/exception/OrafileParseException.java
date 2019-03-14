package github.clyoudu.dpinj.interpreter.exception;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2017/12/4
 * @time 21:16
 * @desc OrafileParseException
 */
public class OrafileParseException extends RuntimeException {

    public OrafileParseException(String message){
        super(message);
    }

    public OrafileParseException(Throwable throwable){
        super(throwable);
    }

}
