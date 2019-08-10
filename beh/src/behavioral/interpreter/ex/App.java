package behavioral.interpreter.ex;

public class App {
    public static void main(String[] args) {
//        Experesion experesion = new TerminalExpresion("ruter");
//        boolean x = experesion.sayWhatToDo("1 ruter 3");
//        System.out.println("x x x "+x);

        Experesion experesion1 = new TerminalExpresion("ruter1");
        Experesion experesion2 = new TerminalExpresion("ruter2");

        Experesion orExpersion = new ORExpersion(experesion1, experesion2);
        boolean x = orExpersion.sayWhatToDo("ruter ruter2");
        System.out.println("x: "+x);
    }
}
