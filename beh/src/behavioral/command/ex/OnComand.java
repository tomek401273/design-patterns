package behavioral.command.ex;

import behavioral.memento.Employee;

public class OnComand implements Command {
    Enterpise enterpise;

    public OnComand(Enterpise enterpise) {
        this.enterpise = enterpise;
    }

    @Override
    public void chagneStrategy() {
        enterpise.changeStrategy();
    }
}
