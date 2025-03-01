// User.java
public class User {
    public User(String username2, String password2, String email2) {
        //TODO Auto-generated constructor stub
    }
    private int userId;
    private String username;
    private String password;
    private String email;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Constructor, getters, and setters
}

// Book.java
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    // Constructor, getters, and setters
}

// Transaction.java
public class Transaction {
    private int transactionId;
    private User user;
    private Book book;
    private Date transactionDate;
    private Date returnDate;

    // Constructor, getters, and setters
}

