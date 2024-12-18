import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private String name;
    private List<Book> books;
    private List<LibraryUser> users;
    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<LibraryUser> getUsers() {
        return users;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void  addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void registerUser(LibraryUser user) {
        users.add(user);
    }

    public void lendBook(Book book, LibraryUser user) {
        if (books.contains(book)){
            user.borrowBook(book);
            removeBook(book);
        }
    }
    public void receiveBook(Book book, LibraryUser user){
        user.returnBook(book);
        addBook(book);
    }

    @Override
    public String toString() {
        String bookTitles = books.stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        return "Library [Name: " + name + ", Books: " + bookTitles + ", Users: " + users + "]";
    }
}
