package edu.csudh.ooad.logicgates;

/**
 * Represents a NAND logic gate.
 */
public class NandGate extends AbstractGate {

    /**
     * Constructs a NAND gate with two inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */
    public NandGate(int input1, int input2) {
        super(input1, input2);
    }

    @Override
    protected int compute() {
        return ~(input1 & input2) & 1; // Ensuring the output is either 0 or 1
    }

}
