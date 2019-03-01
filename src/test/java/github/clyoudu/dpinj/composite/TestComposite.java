package github.clyoudu.dpinj.composite;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 21:49
 * @desc TestComposite
 */
public class TestComposite {

    @Test
    public void test() {

        Department it = new Department("IT");
        Department rd = new Department("Research and Development");
        Department om = new Department("Operation and Maintenance");
        Department ar = new Department("Architecture");

        it.addAll(Arrays.asList(
                new Employee("Ashe", "ashe@company.com"),
                new Employee("Bob", "bob@company.com"),
                new Employee("Candy", "candy@company.com"),
                new Employee("David", "david@company.com")
        ));

        rd.addAll(Arrays.asList(
                new Employee("Eric", "eric@company.com"),
                new Employee("Fizz", "fizz@company.com"),
                new Employee("Galio", "galio@company.com"),
                new Employee("Harris", "harris@company.com")
        ));

        om.addAll(Arrays.asList(
                new Employee("Iran", "iran@company.com"),
                new Employee("John", "john@company.com"),
                new Employee("Kat", "kat@company.com"),
                new Employee("Lucian", "lucian@company.com")
        ));

        ar.addAll(Arrays.asList(
                new Employee("Mondor", "mondor@company.com"),
                new Employee("Nox", "nox@company.com"),
                new Employee("Olaf", "olaf@company.com"),
                new Employee("Puff", "puff@company.com")
        ));

        it.addAll(Arrays.asList(rd, om, ar));

        it.sendMail();

    }

    /*
    Send mail to department IT -------------------
    Send mail to Ashe(ashe@company.com)...
    Send mail to Bob(bob@company.com)...
    Send mail to Candy(candy@company.com)...
    Send mail to David(david@company.com)...

    Send mail to department Research and Development -------------------
    Send mail to Eric(eric@company.com)...
    Send mail to Fizz(fizz@company.com)...
    Send mail to Galio(galio@company.com)...
    Send mail to Harris(harris@company.com)...

    Send mail to department Operation and Maintenance -------------------
    Send mail to Iran(iran@company.com)...
    Send mail to John(john@company.com)...
    Send mail to Kat(kat@company.com)...
    Send mail to Lucian(lucian@company.com)...

    Send mail to department Architecture -------------------
    Send mail to Mondor(mondor@company.com)...
    Send mail to Nox(nox@company.com)...
    Send mail to Olaf(olaf@company.com)...
    Send mail to Puff(puff@company.com)...
     */

}
