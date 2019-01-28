package github.clyoudu.dpinj.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 11:10
 * @description AbstractHostVerHandler
 */
public abstract class AbstractHostVerHandler {

    protected String version;

    protected final static Long TIMEOUT = 3000L;

    public String getVersion(){
        if(version == null){
            return version();
        }
        return version;
    }

    protected String readInputStream(InputStream is){
        BufferedReader reader = null;
        try {
            reader  = new BufferedReader(new InputStreamReader(is));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            if(reader != null) try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract String version();

}
