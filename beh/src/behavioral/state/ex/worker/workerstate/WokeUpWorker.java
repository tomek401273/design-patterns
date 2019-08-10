package behavioral.state.ex.worker.workerstate;

import behavioral.state.ex.worker.Worker;
import behavioral.state.ex.worker.state.State;

public class WokeUpWorker extends State {
    private Worker worker;

    public WokeUpWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void handleRequest() {
        System.out.println("Worker is waking up");
        worker.setState(worker.getStartWork());
    }

    @Override
    public String toString() {
        return "Worker is waking up";
    }

}
