package proxy.first;

import proxy.first.proxy.SecurityProxy;
import proxy.first.twitterService.TwitterService;
import proxy.first.twitterService.impl.TwitterServiceStub;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
		
		System.out.println(service.getTimeline("bh5k"));
		
//		service.postToTimeline("bh5k", "Some message that shouldn't go through.");
	}
}
