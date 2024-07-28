package edu.csudh.ooad

import edu.csudh.ooad.adder.HalfAdder
import spock.lang.Specification

class HalfAdderSpec extends Specification {
    def "HalfAdder should return correct sum and carry"() {
        expect:
        def halfAdder = new HalfAdder(input1, input2)
        halfAdder.getSum() == expectedSum
        halfAdder.getCarry() == expectedCarry

        where:
        input1 | input2 || expectedSum | expectedCarry
        1      | 1      || 0           | 1
        1      | 0      || 1           | 0
        0      | 1      || 1           | 0
        0      | 0      || 0           | 0
    }
}
