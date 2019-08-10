package behavioral.chain.ex;

public abstract class Chain {
    protected Chain supperior;

    public void setSupperior(Chain supperior) {
        this.supperior = supperior;
    }

    public abstract void doSomeStuff(Task task);
}
