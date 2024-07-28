package edu.csudh.ooad.logicgates;

/**
 * Represents an AND logic gate.
 */
public class AndGate extends AbstractGate {

    /**
     * Constructs an AND gate with two inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */
    public AndGate(int input1, int input2) {
        super(input1, input2);
    }

    @Override
    protected int compute() {
        return input1 & input2;
    }

}
