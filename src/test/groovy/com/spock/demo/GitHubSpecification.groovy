/**
 * 
 */
package com.spock.demo

import geb.spock.GebSpec
import spock.lang.Stepwise

@Stepwise
class GitHubSpecification extends GebSpec {

	def setupSpec(){
		System.setProperty("webdriver.chrome.driver", "C:\\browser_drivers\\chromedriver.exe")
	}

	def "Clicking on spock_demo link in github should take to that link page"(){

		when : "Go to github page and click on spock_demo link"
		to Github
		spockDemoLinkAtHome.click()

		then: "You should see breadcrumb with links"
		waitFor(5){
			spockDemoLink.text() == "spock_demo"
			backToHomeLink.text() == "swapnilbhagat"
		}
	}

	def "In spock_demo page clicking on home breadbrumb brings back to home page"(){
		when : "When home link is clicked"
		backToHomeLink.click()

		then: "You should be in github home page"
		waitFor(5){
			homeOwnerName.text() == "Swapnil Bhagat"
		}
	}
}
