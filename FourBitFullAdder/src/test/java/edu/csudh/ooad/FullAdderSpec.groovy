package edu.csudh.ooad

import edu.csudh.ooad.adder.FullAdder
import spock.lang.Specification

class FullAdderSpec extends Specification {
    def "FullAdder should return correct sum and carry"() {
        expect:
        def fullAdder = new FullAdder(input1, input2, carryIn)
        fullAdder.getSum() == expectedSum
        fullAdder.getCarry() == expectedCarry

        where:
        input1 | input2 | carryIn || expectedSum | expectedCarry
        1      | 1      | 1       || 1           | 1
        1      | 0      | 0       || 1           | 0
        0      | 1      | 0       || 1           | 0
        0      | 0      | 0       || 0           | 0
    }
}
