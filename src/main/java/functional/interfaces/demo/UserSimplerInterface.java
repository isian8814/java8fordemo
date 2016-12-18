package functional.interfaces.demo;

import interfaces.SimpleInterface;
import interfaces.SimpleInterfaceWithArgs;

/**
 * Created by minchanglong on 12/17/16.
 */
public class UserSimplerInterface {

    public static void main(String[] args) {

        SimpleInterface obj = () -> System.out.println("Say something");
        obj.doSomething();

        SimpleInterfaceWithArgs objWithArgs = (v1, v2) -> {
            int result = v1 + v2;
            System.out.println("The result is " + result);
        };
        objWithArgs.calculate(10, 15);
    }
}
