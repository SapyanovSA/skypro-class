import java.util.Objects;

public class Author {

    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (getClass() != object.getClass() || object == null) {
            return false;
        }
        Author author = (Author) object;
        return name.equals(author.name) && secondName.equals(author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return name + " " + secondName;
    }
}
