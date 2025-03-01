import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        // Example of adding a user
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        User newUser  = new User(username, password, email);
        librarySystem.addUser (newUser );

        // More options for borrowing books, returning books, etc.
    }
}