package github.clyoudu.dpinj.composite;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 21:39
 * @desc Employee
 */
public class Employee extends Element {

    private String email;

    public Employee(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void sendMail() {
        System.out.println("Send mail to " + name + "(" + email + ")...");
    }
}
