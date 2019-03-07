package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:17
 * @desc Range
 */
public class Range {

    private Integer min;

    private Integer max;

    private Boolean containsMin;

    private Boolean containsMax;
    
    public boolean check (Integer integer){
        boolean a;
        boolean b;
        if(containsMin){
            a = integer >= min;
        }else{
            a = integer > min;
        }
        if(containsMax){
            b = integer <= max;
        }else{
            b = integer < max;
        }
        return a && b;
    }

    public Integer getMin() {
        return min;
    }

    public Range setMin(Integer min) {
        this.min = min;
        return this;
    }

    public Integer getMax() {
        return max;
    }

    public Range setMax(Integer max) {
        this.max = max;
        return this;
    }

    public Boolean getContainsMin() {
        return containsMin;
    }

    public Range setContainsMin(Boolean containsMin) {
        this.containsMin = containsMin;
        return this;
    }

    public Boolean getContainsMax() {
        return containsMax;
    }

    public Range setContainsMax(Boolean containsMax) {
        this.containsMax = containsMax;
        return this;
    }
}
