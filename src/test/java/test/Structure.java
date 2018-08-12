package test;

/**
 * @author Alexei Orishchenko
 */
public class Structure {
	public void root() {
		doWork();
	}

    protected void anotherRoot() {
        init();
        multiply();
        sum();
    }

	private void doWork() {
		init();
		calculate();
	}

	private void init() {
	}

	private void calculate() {
		sum();
	}

	private void sum() { log(); }
	private void multiply() { doMultiply(); log(); }
	private void doMultiply() { }

	public int factorial(int n) {
		return n > 1 ? n * factorial(n - 1) : 1;
	}

    private void log() {
    }
}
