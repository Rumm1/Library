import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryUser {
    private String name;
    private int userId;
    private List<Book> borrowerBooks;

    public LibraryUser(String name, int userId){
        this.name=name;
        this.userId=userId;
        this.borrowerBooks= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBorrowerBooks() {
        return borrowerBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void borrowBook(Book book){
        borrowerBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowerBooks.remove(book);
    }

    @Override
    public String toString() {
        String borrowedTitles = borrowerBooks.stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        return "User [Name: "+ name + ", ID: "+ userId + ", Borrowes Books: " + borrowedTitles + "]";
    }
}
