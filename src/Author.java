import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public boolean equals(Object comparisonObject) {
        if (this == comparisonObject) {
            return true;
        }
        if (comparisonObject == null || getClass() != comparisonObject.getClass()) {
            return false;
        }
        Author auth = (Author) comparisonObject;
        return Objects.equals(authorName, ((Author) comparisonObject).authorName) && Objects.equals(authorSurname, ((Author) comparisonObject).authorSurname);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }


}
