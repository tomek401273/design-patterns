package proxy.ex.service;

public class SuperWorker implements Worker {
    @Override
    public String doTask(String task) {
        return "Super fast do task: "+task;
    }
}
