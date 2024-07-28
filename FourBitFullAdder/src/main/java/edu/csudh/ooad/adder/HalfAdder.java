package edu.csudh.ooad.adder;

import edu.csudh.ooad.logicgates.AndGate;
import edu.csudh.ooad.logicgates.NandGate;

/**
 * Represents a Half Adder Circuit.
 */
public class HalfAdder {

    private int sum;
    private int carry;

    /**
     * Constructs a half adder with two inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */
    public HalfAdder(int input1, int input2) {
        NandGate nand1 = new NandGate(input1, input2);
        NandGate nand2 = new NandGate(input1, nand1.getOutput());
        NandGate nand3 = new NandGate(input2, nand1.getOutput());
        NandGate nand4 = new NandGate(nand2.getOutput(), nand3.getOutput());
        this.sum = nand4.getOutput();
        this.carry = new AndGate(input1, input2).getOutput();
    }

    /**
     * Returns the sum output of the half adder.
     *
     * @return the sum output
     */
    public int getSum() {
        return sum;
    }

    /**
     * Returns the carry output of the half adder.
     *
     * @return the carry output
     */
    public int getCarry() {
        return carry;
    }

}
