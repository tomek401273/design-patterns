package behavioral.mediator.ex;

public class TunOnLightsCommand implements Command {
    Mediator mediator;

    public TunOnLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void kill(String thingsToKill) {
        mediator.turnOnAllLights();
    }
}
