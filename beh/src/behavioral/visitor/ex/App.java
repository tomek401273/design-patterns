package behavioral.visitor.ex;

import behavioral.visitor.ex.activity.Eat;
import behavioral.visitor.ex.activity.Relax;
import behavioral.visitor.ex.activity.SummaryActivity;
import behavioral.visitor.ex.activity.Work;
import behavioral.visitor.ex.worker.WorkerCalculateOperationTime;
import behavioral.visitor.ex.worker.WorkerSayWhatDoing;

public class App {
    public static void main(String[] args) {
        SummaryActivity summaryActivity = new SummaryActivity();
        summaryActivity.addActivity(new Eat());
        summaryActivity.addActivity(new Work());
        summaryActivity.addActivity(new Eat());
        summaryActivity.addActivity(new Work());
        summaryActivity.addActivity(new Relax());

        WorkerSayWhatDoing workerSayWhatDoing = new WorkerSayWhatDoing();
        summaryActivity.accept(workerSayWhatDoing);
        System.out.println();
        System.out.println();
        System.out.println("Calculatie time.....");
        WorkerCalculateOperationTime workerCalculateOperationTime = new WorkerCalculateOperationTime();
        summaryActivity.accept(workerCalculateOperationTime);
    }
}
