package edu.csudh.ooad.logicgates;

/**
 * Abstract class for logic gates.
 */
public abstract class AbstractGate {

    protected int input1;
    protected int input2;
    protected int output;

    /**
     * Constructs a logic gate with two inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */
    public AbstractGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
        this.output = compute();
    }

    /**
     * Computes the output of the logic gate.
     *
     * @return the output
     */
    protected abstract int compute();

    /**
     * Returns the output of the logic gate.
     *
     * @return the output
     */
    public int getOutput() {
        return output;
    }
}

