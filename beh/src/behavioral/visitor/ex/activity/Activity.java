package behavioral.visitor.ex.activity;

import behavioral.visitor.ex.worker.Worker;

public interface Activity {
    void accept(Worker worker);
}
