package behavioral.state.ex.worker.workerstate;

import behavioral.state.ex.worker.Worker;
import behavioral.state.ex.worker.state.State;

public class WorkerStartWork extends State {
    private Worker worker;

    public WorkerStartWork(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void handleRequest() {
        System.out.println("Worker start work");
        worker.setState(worker.getEndWork());
    }
}
