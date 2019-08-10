package structural.Bridge.ex.model;

public class Books {
    String title;
    String details;
    String author;

    public Books(String title, String details, String author) {
        this.title = title;
        this.details = details;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getAuthor() {
        return author;
    }
}
