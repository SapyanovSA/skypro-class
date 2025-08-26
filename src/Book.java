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
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (getClass() != object.getClass() || object == null) {
            return false;
        }
        Book newBook = (Book) object;
        return bookName.equals(newBook.bookName) && author.equals(newBook.author) && yearOfPublication == newBook.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author.hashCode(), yearOfPublication);
    }

    @Override
    public String toString() {
         return "Книга: " + bookName + ". Автор:" + author.toString() + ". Год выпуска " + yearOfPublication;
    }
}
