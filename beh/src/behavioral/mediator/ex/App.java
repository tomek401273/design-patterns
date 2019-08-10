package behavioral.mediator.ex;


import java.util.List;

public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Ligth beedromLight = new Ligth("beedroom");
        mediator.registerLigh(beedromLight);
        Ligth livingRoom = new Ligth("living room");
        mediator.registerLigh(livingRoom);
        Command command = new TunOnLightsCommand(mediator);
        command.kill("dd");
        System.out.println(beedromLight.isTurnOn());
        System.out.println(livingRoom.isTurnOn());

        Command command1 = new TunOffLightsCommand(mediator);
        command1.kill("d");
        System.out.println();
        System.out.println(beedromLight.isTurnOn());
        System.out.println(livingRoom.isTurnOn());
    }
}
