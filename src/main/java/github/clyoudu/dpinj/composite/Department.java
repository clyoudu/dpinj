package github.clyoudu.dpinj.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 21:39
 * @desc Department
 */
public class Department extends Element {

    private List<Element> elements;

    public Department(String name) {
        super(name);
        this.elements = new ArrayList<>();
    }

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public void addAll(List<Element> elementList){
        elements.addAll(elementList);
    }

    public void removeAll(List<Element> elementList){
        elements.removeAll(elementList);
    }

    @Override
    public void sendMail() {
        System.out.println("\nSend mail to department " + name + " -------------------");
        if(elements != null && !elements.isEmpty()){
            elements.forEach(Element::sendMail);
        }
    }
}
