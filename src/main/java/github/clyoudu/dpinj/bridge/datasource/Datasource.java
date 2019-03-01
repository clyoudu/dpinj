package github.clyoudu.dpinj.bridge.datasource;

import github.clyoudu.dpinj.bridge.output.Output;

import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/1 14:37
 * @description Datasource
 */
public abstract class Datasource {

    protected Output output;

    public Datasource(Output output){
        this.output = output;
    }

    public abstract void report(Map<String,Object> configMap);

}
