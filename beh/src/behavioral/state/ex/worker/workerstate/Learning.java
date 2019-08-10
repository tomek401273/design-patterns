package behavioral.state.ex.worker.workerstate;

import behavioral.state.ex.worker.Worker;
import behavioral.state.ex.worker.state.State;

public class Learning extends State {
    Worker worker;

    public Learning(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void handleRequest() {
        System.out.println("Learning after work learning hard");
        worker.setState(worker.getSleep());
    }
}
