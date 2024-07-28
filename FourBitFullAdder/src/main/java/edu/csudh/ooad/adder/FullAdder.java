package edu.csudh.ooad.adder;

import edu.csudh.ooad.logicgates.OrGate;

/**
 * Represents a full adder circuit.
 */
public class FullAdder {

    private int sum;
    private int carry;

    /**
     * Constructs a full adder with three inputs.
     *
     * @param input1  the first input
     * @param input2  the second input
     * @param carryIn the carry-in input
     */
    public FullAdder(int input1, int input2, int carryIn) {
        HalfAdder ha1 = new HalfAdder(input1, input2);
        HalfAdder ha2 = new HalfAdder(ha1.getSum(), carryIn);
        OrGate orGate = new OrGate(ha1.getCarry(), ha2.getCarry());
        this.sum = ha2.getSum();
        this.carry = orGate.getOutput();
    }

    /**
     * Returns the sum output of the full adder.
     *
     * @return the sum output
     */
    public int getSum() {
        return sum;
    }

    /**
     * Returns the carry output of the full adder.
     *
     * @return the carry output
     */
    public int getCarry() {
        return carry;
    }

}
