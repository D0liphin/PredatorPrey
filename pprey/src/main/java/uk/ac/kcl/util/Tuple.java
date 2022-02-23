package uk.ac.kcl.util;

/**
 * Tuple for dimensions of various types
 */
public final class Tuple<A, B> {
    private A a;
    private B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    /** Setter for the first element of this tuple */
    public void setA(A a) { this.a = a; }

    /** Getter for the first element of this tuple */
    public A getA() { return this.a; }

    /** Setter for the second element of this tuple */
    public void setB(B b) { this.b = b; }

	/** Getter for the second element of this tuple */
	public B getB() { return this.b; }
}
