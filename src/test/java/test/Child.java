package test;

/**
 * @author Alexei Orishchenko
 */
public class Child {
    public void drawChild() {
        drawIcon();
        drawTitle();
    }

    private void drawTitle() {
        log();
    }

    private void drawIcon() {
        log();
    }

    private void log() {}

    public void depTest() {}
}
