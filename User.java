package entities;

public class User {
    private String email;
    private String fullnames;
    private String password;
    private boolean isAdmin;

    public User(String email, String fullnames, String password, boolean isAdmin) {
        this.email = email;
        this.fullnames = fullnames;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean verifyCardentials(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getEmail() { return email; }
    public String getName() { return fullnames; }
    public boolean isAdmin() { return isAdmin; }
}