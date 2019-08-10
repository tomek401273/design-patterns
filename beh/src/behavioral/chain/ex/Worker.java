package behavioral.chain.ex;

public class Worker extends Chain {

    @Override
    public void doSomeStuff(Task task) {
        if (task.getTypeTask().equals(TypeTask.SMALL_TASK)) {
            System.out.println("I can do it rigt now");
        } else {
            supperior.doSomeStuff(task);
        }
    }
}
