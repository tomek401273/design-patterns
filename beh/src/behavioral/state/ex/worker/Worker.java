package behavioral.state.ex.worker;

import behavioral.state.ex.worker.state.State;
import behavioral.state.ex.worker.workerstate.*;

public class Worker {
    private State wokeUp;
    private State startWork;
    private State endWork;
    private State learning;
    private State sleep;

    State state;

    public Worker() {
        wokeUp = new WokeUpWorker(this);
        startWork = new WorkerStartWork(this);
        endWork = new EndWork(this);
        learning = new Learning(this);
        sleep = new Sleep(this);

        state = wokeUp;
    }

    public void changeState() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWokeUp() {
        return wokeUp;
    }

    public State getStartWork() {
        return startWork;
    }

    public State getEndWork() {
        return endWork;
    }

    public State getLearning() {
        return learning;
    }

    public State getSleep() {
        return sleep;
    }
}
