package behavioral.chain.second.handler.impl;

import behavioral.chain.second.request.Request;
import behavioral.chain.second.handler.Handler;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}
}
