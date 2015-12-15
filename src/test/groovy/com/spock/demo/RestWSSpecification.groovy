/**
 * 
 */
package com.spock.demo

import org.springframework.web.client.RestTemplate

import spock.lang.Specification

class RestWSSpecification extends Specification{

	def "Testing rest ws with uid 1"(){
		when:"Request is send with uid 1"
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("http://localhost:8080/person/uid?uid=1", Person.class);

		then:"Person with John Cena is received"
		person.firstName == "John"
		person.lastName == "Cena"
	}
}
