package com.spock.demo

import geb.Page

class Github extends Page {

	static url = "http://www.github.com/swapnilbhagat/"
	static at = { title == "swapnilbhagat (Swapnil Bhagat) · GitHub" }

	static content = {
		spockDemoLinkAtHome { $("a[href='/swapnilbhagat/spock_demo']")}
		spockDemoLink {$("a[data-pjax='#js-repo-pjax-container']")}
		backToHomeLink { $("a span[itemprop='title']")}
		homeOwnerName {$("span[class='vcard-fullname']")}
	}
}
