package behavioral.chain.second;


import behavioral.chain.second.handler.impl.CEO;
import behavioral.chain.second.handler.impl.Director;
import behavioral.chain.second.handler.impl.VP;
import behavioral.chain.second.request.Request;
import behavioral.chain.second.request.RequestType;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		crystal.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);
	}
}
