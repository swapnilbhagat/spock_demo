/**
 * 
 */
package com.spock.demo

import spock.lang.Specification

class ServiceToBeTestedSpecification extends Specification {
	
	def doesNotContainsABCScenario1(){
		given:
		def param = 'AAAAAA'

		when:
		boolean containsABC = ServiceToBeTested.containsABC(param)

		then:
		containsABC == false
	}

	def "does not contains ABC - scenario 2"(){
		given:
		def param = 'AAAAAA'

		when:
		boolean containsABC = ServiceToBeTested.containsABC(param)

		then:
		containsABC == false
	}

	def "does not contains ABC - scenario 3"(String param, boolean containsABC){
		expect:
		containsABC == ServiceToBeTested.containsABC(param)

		where:
		param        || containsABC
		'AAAAABBCAA' || false
		'ACBC'       || false
		''           || false
	}


	def "contains ABC - scenario 1"(){
		setup:
		def param = 'AAAAAABC'

		when:
		boolean containsABC = ServiceToBeTested.containsABC(param)

		then:
		containsABC == true

		cleanup:
		param = null
	}

	def "contains ABC - scenario 2"(String param, boolean containsABC){
		expect:
		containsABC == ServiceToBeTested.containsABC(param)

		where:
		param        || containsABC
		'AAAAAABCAA' || true
		'ABC'        || true
	}

	def "Exception expected"(){
		given:"We are giving null param to service"
		def param = null

		when:
		boolean containsABC = ServiceToBeTested.containsABC(param)

		then:"service method has thrown NullPointerException"
		thrown(NullPointerException)
	}

	def setup(){
	}

	def cleanup(){
	}

	def setupSpec(){
	}

	def cleanupSpec(){
	}
}
