package behavioral.visitor.ex.activity;

import behavioral.visitor.ex.worker.Worker;

public class Eat implements Activity {
    @Override
    public void accept(Worker worker) {
        worker.doit(this);
    }
}
