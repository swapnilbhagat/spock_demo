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
		go "http://www.github.com/swapnilbhagat/"
		$("a[href='/swapnilbhagat/spock_demo']").click()

		then: "You should see breadcrumb with links"
		waitFor(5){
			$("a[data-pjax='#js-repo-pjax-container']").text() == "spock_demo"
			$("a span[itemprop='title']").text() == "swapnilbhagat"
		}
	}

	def "In spock_demo page clicking on home breadbrumb brings back to home page"(){
		when : "When home link is clicked"
		$("a span[itemprop='title']").click()

		then: "You should be in github home page"
		waitFor(5){
			$("span[class='vcard-fullname']").text() == "Swapnil Bhagat"
		}
	}
}
