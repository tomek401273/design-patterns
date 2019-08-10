package behavioral.observer.ex;

import java.util.Observable;
import java.util.Observer;

public class App {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();

        RandomJanusz janusz1 = new RandomJanusz("janusz 1");
        RandomJanusz janusz2 = new RandomJanusz("janusz 2");

        facebook.addObserver(janusz1);
        facebook.addObserver(janusz2);
        facebook.newMessage();


    }
}

class Facebook extends Observable {
    public void newMessage() {
        setChanged();
        notifyObservers();
    }
}

class RandomJanusz implements Observer {
    private String name;
    private int age;

    public RandomJanusz(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Janusz "+ name +"new message on facebook " );
    }
}
