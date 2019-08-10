package structural.Bridge.ex;

import structural.Bridge.ex.formater.Formater;
import structural.Bridge.ex.formater.MyPrinter;
import structural.Bridge.ex.model.Books;
import structural.Bridge.ex.printer.PrintFormater;
import structural.Bridge.ex.printer.Printer;

public class App {
    public static void main(String[] args) {
        Books books = new Books("myTitle", "myDetail", "Thomas");
        Printer printer = new PrintFormater(books);
        Formater formater = new MyPrinter();
        String x = printer.print(formater);
        System.out.println(x);

    }

}
