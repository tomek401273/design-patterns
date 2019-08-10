package behavioral.command.ex;

public class App {
    public static void main(String[] args) {
        Enterpise enterpise = new Enterpise();
        Command command1 = new OnComand(enterpise);
        Shuiffle  shuiffle = new Shuiffle();
        shuiffle.shuffle(command1);
        shuiffle.shuffle(command1);

    }
}
