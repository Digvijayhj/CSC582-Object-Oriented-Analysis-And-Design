package edu.csudh.ooad

import edu.csudh.ooad.logicgates.NandGate
import spock.lang.Specification

class NandGateSpec extends Specification {
    def "NandGate should return correct output"() {
        expect:
        new NandGate(input1, input2).getOutput() == expectedOutput

        where:
        input1 | input2 || expectedOutput
        1      | 1      || 0
        1      | 0      || 1
        0      | 1      || 1
        0      | 0      || 1
    }
}