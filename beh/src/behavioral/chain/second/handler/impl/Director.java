package behavioral.chain.second.handler.impl;

import behavioral.chain.second.request.Request;
import behavioral.chain.second.request.RequestType;
import behavioral.chain.second.handler.Handler;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can approve conferences");
		}
		else {
			successor.handleRequest(request);
		}
	}
}
