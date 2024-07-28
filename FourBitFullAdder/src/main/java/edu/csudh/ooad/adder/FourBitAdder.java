package edu.csudh.ooad.adder;

/**
 * Represents a four-bit adder circuit.
 */
public class FourBitAdder {

    private int[] sum = new int[4];
    private int carry;

    /**
     * Constructs a four-bit adder with two four-bit inputs and a carry-in.
     *
     * @param inputA  the first four-bit input as an integer
     * @param inputB  the second four-bit input as an integer
     * @param carryIn the carry-in input as an integer (0 or 1)
     */
    public FourBitAdder(int inputA, int inputB, int carryIn) {
        // Convert integers to binary arrays
        int[] binA = toBinaryArray(inputA);
        int[] binB = toBinaryArray(inputB);

        // Perform full addition for each bit
        FullAdder fa0 = new FullAdder(binA[3], binB[3], carryIn); // Least significant bit
        FullAdder fa1 = new FullAdder(binA[2], binB[2], fa0.getCarry());
        FullAdder fa2 = new FullAdder(binA[1], binB[1], fa1.getCarry());
        FullAdder fa3 = new FullAdder(binA[0], binB[0], fa2.getCarry()); // Most significant bit

        // Collect the results
        sum[3] = fa0.getSum();
        sum[2] = fa1.getSum();
        sum[1] = fa2.getSum();
        sum[0] = fa3.getSum();
        carry = fa3.getCarry();
    }

    /**
     * Returns the sum output of the four-bit adder.
     *
     * @return the sum output as an integer
     */
    public int getSum() {
        return toDecimal(sum);
    }

    /**
     * Returns the carry output of the four-bit adder.
     *
     * @return the carry output
     */
    public int getCarry() {
        return carry;
    }

    /**
     * Converts an integer to a 4-bit binary array.
     *
     * @param num the integer to convert
     * @return a 4-bit binary array
     */
    private int[] toBinaryArray(int num) {
        int[] binary = new int[4];
        for (int i = 3; i >= 0; i--) {
            binary[i] = num & 1;
            num >>= 1;
        }
        return binary;
    }

    /**
     * Converts a 4-bit binary array to an integer.
     *
     * @param binary the binary array to convert
     * @return the integer representation
     */
    private int toDecimal(int[] binary) {
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = (num << 1) | binary[i];
        }
        return num;
    }
}