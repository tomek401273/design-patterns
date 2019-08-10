package behavioral.mediator.ex;

public class Ligth {
    private boolean turnOn = false;
    private String room;

    public Ligth(String room) {
        this.room = room;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
