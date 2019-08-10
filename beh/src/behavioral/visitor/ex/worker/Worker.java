package behavioral.visitor.ex.worker;

import behavioral.visitor.ex.activity.Eat;
import behavioral.visitor.ex.activity.Relax;
import behavioral.visitor.ex.activity.SummaryActivity;
import behavioral.visitor.ex.activity.Work;

public interface Worker {
    void doit(Eat eat);
    void doit(Work work);
    void doit(SummaryActivity summaryActivity);
    void doit(Relax relax);
}
