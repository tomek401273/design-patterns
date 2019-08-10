package structural.Bridge.ex.printer;

import structural.Bridge.ex.formater.Formater;
import structural.Bridge.ex.model.Books;
import structural.Bridge.ex.model.Detatil;

import java.util.ArrayList;
import java.util.List;

public class PrintFormater extends Printer {
    private Books books;

    public PrintFormater(Books books) {
        this.books = books;
    }

    @Override
    public List<Detatil> getDetails() {
        List<Detatil> detatilList = new ArrayList<>();
        detatilList.add(new Detatil("title", books.getTitle()));
        detatilList.add(new Detatil("details", books.getDetails()));
        return detatilList;
    }

    @Override
    public String getAttribute() {
        return books.getAuthor();
    }
}
