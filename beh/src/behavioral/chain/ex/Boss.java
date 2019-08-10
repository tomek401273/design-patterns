package behavioral.chain.ex;

public class Boss extends Chain {
    @Override
    public void doSomeStuff(Task task) {
        if (task.getTypeTask().equals(TypeTask.THEBIGGESTTASK)) {
            System.out.println("I am boss I can do anthing I wont");
        }
    }
}
