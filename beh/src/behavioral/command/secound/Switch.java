package behavioral.command.secound;

import behavioral.command.secound.Command;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
