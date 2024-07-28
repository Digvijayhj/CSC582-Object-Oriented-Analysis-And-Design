package edu.csudh.ooad

import edu.csudh.ooad.logicgates.AndGate
import spock.lang.Specification

class AndGateSpec extends Specification {
    def "AndGate should return correct output"() {
        expect:
        new AndGate(input1, input2).getOutput() == expectedOutput

        where:
        input1 | input2 || expectedOutput
        1      | 1      || 1
        1      | 0      || 0
        0      | 1      || 0
        0      | 0      || 0
    }
}