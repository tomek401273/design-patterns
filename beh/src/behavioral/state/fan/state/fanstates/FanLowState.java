package behavioral.state.fan.state.fanstates;

import behavioral.state.fan.Fan;
import behavioral.state.fan.state.State;

public class FanLowState extends State {

private Fan fan;
	
	public FanLowState(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to med.");
		fan.setState(fan.getFanMedState());
	}
	
	public String toString() {
		return "Fan is low.";
	}
}
