package behavioral.state.ex.worker.workerstate;

import behavioral.state.ex.worker.Worker;
import behavioral.state.ex.worker.state.State;

public class EndWork extends State {
    Worker worker;

    public EndWork(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void handleRequest() {
        System.out.println("Worker is end work. Come back to home");
        worker.setState(worker.getLearning());
    }
}
