package behavioral.state.ex.worker.workerstate;

import behavioral.state.ex.worker.Worker;
import behavioral.state.ex.worker.state.State;

public class Sleep extends State {
    private Worker worker;

    public Sleep(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void handleRequest() {
        System.out.println("Worker is tired and he is going to bed.");
        worker.setState(worker.getWokeUp());
    }

}
