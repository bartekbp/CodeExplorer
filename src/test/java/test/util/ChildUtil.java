package test.util;

import test.Child;
import test.SomeAction;
import test.Action;

/**
 * @author Alexei Orishchenko
 */
public class ChildUtil {
    public void doSomething() {
        new Child().drawChild();
    }

    public void interfaceCall() {
        Action a = new SomeAction();
        a.execute();
    }

    public void directCall() {
        SomeAction s = new SomeAction();
        s.execute();
    }
}
