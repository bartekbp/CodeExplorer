package test;

/**
 * @author Alexei Orishchenko
 */
public class ActionTest {
    public void interfaceCall() {
        Action action = new SomeAction();
        action.execute();
    }

    public void directCall() {
        SomeAction a = new SomeAction();
        a.execute();
    }
}
