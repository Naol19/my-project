import java.util.Date;

public class Rental {
    private Date date;
    private Book book;
    private Person person;

    public Rental(Date date, Book book, Person person) {
        this.date = date;
        this.book = book;
        this.person = person;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

}