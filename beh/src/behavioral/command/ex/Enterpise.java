package behavioral.command.ex;

public class Enterpise {
    private boolean shouldShoot;

    public Enterpise() {
        this.shouldShoot = false;
    }

    public boolean isShouldShoot() {
        return shouldShoot;
    }

    public void changeStrategy() {
        if (isShouldShoot()) {
            System.out.println("Cease fire!");
            shouldShoot= false;
        } else {
            System.out.println("Load fazers and shoot NOW!!");
            shouldShoot = true;
        }
    }

}
