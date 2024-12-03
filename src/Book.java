import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга " + bookName + ", " + yearOfPublication + ", года выпуска";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
