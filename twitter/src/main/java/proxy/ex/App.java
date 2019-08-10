package proxy.ex;

import proxy.ex.proxy.SecurityProxy;
import proxy.ex.service.SuperWorker;
import proxy.ex.service.Worker;

public class App {
    public static void main(String[] args) {
        Worker worker = (Worker) SecurityProxy.newInstance(new SuperWorker());
        String done = worker.doTask("clean Windows");
        System.out.println(done);
    }
}
