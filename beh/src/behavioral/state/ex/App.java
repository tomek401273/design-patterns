package behavioral.state.ex;

import behavioral.state.ex.worker.Worker;

public class App {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.changeState();

        for (int i =0; i<6; i++) {
            worker.changeState();
        }
    }
}
