package edu.csudh.ooad.logicgates;

/**
 * Represents an OR logic gate.
 */
public class OrGate extends AbstractGate {

    /**
     * Constructs an OR gate with two inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */
    public OrGate(int input1, int input2) {
        super(input1, input2);
    }

    @Override
    protected int compute() {
        return input1 | input2;
    }

}
