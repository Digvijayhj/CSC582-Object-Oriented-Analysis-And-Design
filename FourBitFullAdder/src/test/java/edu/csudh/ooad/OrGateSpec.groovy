package edu.csudh.ooad

import edu.csudh.ooad.logicgates.OrGate
import spock.lang.Specification

class OrGateSpec extends Specification {
    def "OrGate should return correct output"() {
        expect:
        new OrGate(input1, input2).getOutput() == expectedOutput

        where:
        input1 | input2 || expectedOutput
        1      | 1      || 1
        1      | 0      || 1
        0      | 1      || 1
        0      | 0      || 0
    }
}