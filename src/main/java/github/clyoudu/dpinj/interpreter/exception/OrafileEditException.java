package github.clyoudu.dpinj.interpreter.exception;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2017/12/4
 * @time 23:07
 * @desc OrafileEditException
 */
public class OrafileEditException extends RuntimeException {

    public OrafileEditException(String message){
        super(message);
    }

    public OrafileEditException(Throwable throwable){
        super(throwable);
    }

}
