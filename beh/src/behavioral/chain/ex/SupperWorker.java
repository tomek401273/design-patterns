package behavioral.chain.ex;

public class SupperWorker extends Chain {
    @Override
    public void doSomeStuff(Task task) {
        if (task.getTypeTask().equals(TypeTask.BIGTASK)) {
            System.out.println("I am supperworker I can do big task");
        } else {
            supperior.doSomeStuff(task);
        }
    }
}
