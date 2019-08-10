package behavioral.command.secound;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        Command  onCommand = new OnCommand(light);

        Switch lishtSwith = new Switch();
        lishtSwith.storeAndExecute(onCommand);
    }
}
