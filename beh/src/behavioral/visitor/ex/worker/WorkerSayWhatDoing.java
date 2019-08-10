package behavioral.visitor.ex.worker;

import behavioral.visitor.ex.activity.Eat;
import behavioral.visitor.ex.activity.Relax;
import behavioral.visitor.ex.activity.SummaryActivity;
import behavioral.visitor.ex.activity.Work;

public class WorkerSayWhatDoing implements Worker{

    @Override
    public void doit(Eat eat) {
        System.out.println("I am eating !");
    }

    @Override
    public void doit(Work work) {
        System.out.println("I am working");
    }

    @Override
    public void doit(SummaryActivity summaryActivity) {
        System.out.println("I am summaring all stuff !");
    }

    @Override
    public void doit(Relax relax) {
        System.out.println("Now I am relaxing");
    }
}
