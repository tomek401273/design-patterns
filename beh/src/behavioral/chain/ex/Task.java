package behavioral.chain.ex;

public class Task {
    private TypeTask typeTask;

    public Task(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }
}
