package behavioral.chain.ex;

public class App {
    public static void main(String[] args) {
        Worker worker = new Worker();
        SupperWorker supperWorker = new SupperWorker();
        Boss boss = new Boss();
        worker.setSupperior(supperWorker);
        supperWorker.setSupperior(boss);

        worker.doSomeStuff(new Task(TypeTask.SMALL_TASK));
        worker.doSomeStuff(new Task(TypeTask.BIGTASK));
        worker.doSomeStuff(new Task(TypeTask.THEBIGGESTTASK));

        supperWorker.doSomeStuff(new Task(TypeTask.BIGTASK));
        supperWorker.doSomeStuff(new Task(TypeTask.THEBIGGESTTASK));
    }
}
