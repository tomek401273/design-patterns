package behavioral.interpreter.ex;

public class ORExpersion implements Experesion {
    private Experesion experesion1;
    private Experesion experesion2;

    public ORExpersion(Experesion experesion1, Experesion experesion2) {
        this.experesion1 = experesion1;
        this.experesion2 = experesion2;
    }

    @Override
    public boolean sayWhatToDo(String word) {
       return experesion1.sayWhatToDo(word) || experesion2.sayWhatToDo(word);
    }
}
