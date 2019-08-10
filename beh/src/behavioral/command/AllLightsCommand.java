package behavioral.command;

import behavioral.command.secound.Command;
import behavioral.command.secound.Light;

import java.util.List;

public class AllLightsCommand implements Command {

	private List<Light> lights;
	
	public AllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}
	
	@Override
	public void execute() {
		for (Light light : lights) {
			light.toggle();
			if(light.isOn()) {
			}
		}
	}

}
