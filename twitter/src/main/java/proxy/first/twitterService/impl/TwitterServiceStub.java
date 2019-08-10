package proxy.first.twitterService.impl;

import proxy.first.twitterService.TwitterService;

public class TwitterServiceStub implements TwitterService {

	@Override
	public String getTimeline(String screenName) {
		return "My neato timeline";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		
	}

}
