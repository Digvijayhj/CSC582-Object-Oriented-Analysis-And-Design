package edu.csudh.ooad

import edu.csudh.ooad.adder.FourBitAdder
import spock.lang.Specification

class FourBitAdderSpec extends Specification {
    def "FourBitAdder should return correct sum and carry"() {
        expect:
        def fourBitAdder = new FourBitAdder(inputA, inputB, carryIn)
        fourBitAdder.getSum() == expectedSum
        fourBitAdder.getCarry() == expectedCarry

        where:
        inputA | inputB | carryIn || expectedSum | expectedCarry
        0      | 0      | 0       || 0           | 0   // 0 + 0 + 0 = 0, carry = 0
        0      | 1      | 0       || 1           | 0   // 0 + 1 + 0 = 1, carry = 0
        1      | 1      | 0       || 2           | 0   // 1 + 1 + 0 = 2, carry = 0
        15     | 15     | 0       || 14          | 1   // 15 + 15 + 0 = 30 (14 with carry 1)
        10     | 5      | 0       || 15          | 0   // 10 + 5 + 0 = 15, carry = 0
        7      | 8      | 0       || 15          | 0   // 7 + 8 + 0 = 15, carry = 0
        7      | 8      | 1       || 0           | 1   // 7 + 8 + 1 = 16, carry = 1
        12     | 11     | 1       || 8           | 1   // 12 + 11 + 1 = 24, carry = 1
    }
}