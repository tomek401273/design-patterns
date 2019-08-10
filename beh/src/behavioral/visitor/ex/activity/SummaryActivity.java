package behavioral.visitor.ex.activity;

import behavioral.visitor.ex.worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class SummaryActivity implements Activity {
    List<Activity> activityList = new ArrayList<>();

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    @Override
    public void accept(Worker worker) {
        for (Activity activity: activityList) {
            activity.accept(worker);
        }
        worker.doit(this);
    }
}
