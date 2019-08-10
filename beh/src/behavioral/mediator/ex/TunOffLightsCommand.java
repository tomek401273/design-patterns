package behavioral.mediator.ex;

public class TunOffLightsCommand implements Command {
    private Mediator mediator;

    public TunOffLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void kill(String thingsToKill) {
        mediator.turnOffAllLighs();
    }
}
