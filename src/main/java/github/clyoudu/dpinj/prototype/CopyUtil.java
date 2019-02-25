package github.clyoudu.dpinj.prototype;

import java.io.*;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 14:57
 * @description CopyUtil
 */
public class CopyUtil {

    public static <T> T deepCopy(T source) throws IOException, ClassNotFoundException {
        Object target;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(source);
        objectOutputStream.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        target = objectInputStream.readObject();
        objectInputStream.close();
        return (T) target;
    }

}
