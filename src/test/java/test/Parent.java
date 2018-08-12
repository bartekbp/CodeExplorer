package test;

import java.util.ArrayList;

/**
 * @author Alexei Orishchenko
 */
public class Parent {

    private void init() { log(); }

    public void draw() {
        init();
        for (Child c: new ArrayList<Child>()) {
            c.drawChild();
        }
        updateUI();
    }

    private void updateUI() {
        log();
    }

    private void log() {
    }

    public void depTest() { new Child().depTest(); }
}
