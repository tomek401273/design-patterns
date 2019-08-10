package behavioral.command;

import behavioral.command.secound.Command;
import behavioral.command.secound.Light;

//concrete behavioral.command
public class ToggleCommand implements Command {

	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.toggle();
	}
}