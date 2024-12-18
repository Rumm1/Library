import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Абай жолы", "Мухтар Ауезов", "1234567890", 1942);
        Book book2 = new Book("Көшпенділер", "Ильяс Есенберлин", "0987654321", 1969);
        Book book3 = new Book("Қан мен тер", "Абдижамил Нурпеисов", "1122334455", 1970);

        LibraryUser user1 = new LibraryUser("Aruzhan", 1);
        LibraryUser user2 = new LibraryUser("Iliyas", 2);

        Library library = new Library("Kitap Qala");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.registerUser(user1);
        library.registerUser(user2);

        System.out.println("Initial Library State:");
        System.out.println(library);

        System.out.println("\nAlice borrows '1984':");
        library.lendBook(book1, user1);
        System.out.println(library);
        System.out.println(user1);

        System.out.println("\nAlice returns '1984':");
        library.receiveBook(book1, user1);
        System.out.println(library);
        System.out.println(user1);

        System.out.println("\nComparing Books:");
        System.out.println("Is book1 the same as book2? " + (book1.equals(book2) ? "Yes" : "No"));
    }
}