package github.clyoudu.dpinj.observer.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/14 17:26
 * @description PrintUtil
 */
public class PrintUtil {

    public static void println(String msg) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] " + msg);
    }

    public static void main(String[] args){
        println("1111");
    }

}
