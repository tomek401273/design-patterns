package behavioral.visitor.ex.worker;

import behavioral.visitor.ex.activity.Eat;
import behavioral.visitor.ex.activity.Relax;
import behavioral.visitor.ex.activity.SummaryActivity;
import behavioral.visitor.ex.activity.Work;

public class WorkerCalculateOperationTime implements Worker {
    private int time = 0;

    @Override
    public void doit(Eat eat) {
        time++;
        System.out.println("Eating 1 hour");
    }

    @Override
    public void doit(Work work) {
        time = time + 5;
        System.out.println("Working 5 hours");
    }

    @Override
    public void doit(SummaryActivity summaryActivity) {
        System.out.println("Summary summary");
        System.out.println("Time needed to passs all activities today: " + time);
    }

    @Override
    public void doit(Relax relax) {
        System.out.println("Relaxing.... 1 hour");
        time++;
    }
}
