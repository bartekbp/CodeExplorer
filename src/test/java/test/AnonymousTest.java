package test;

/**
 * @author Alexei Orishchenko
 */
public class AnonymousTest {
    public void testInner() {
        new Runnable() {
            public void run() {
                other();
            }
        };
    }

    public void testInnerCall() {
        Runnable r = new Runnable() {
            public void run() {
                other();
            }
        };
        r.run();
    }

    private void other() {}
}
