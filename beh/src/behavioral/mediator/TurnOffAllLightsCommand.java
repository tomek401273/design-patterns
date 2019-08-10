package behavioral.mediator;

//concrete behavioral.command
public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOffAllLights();
	}
}