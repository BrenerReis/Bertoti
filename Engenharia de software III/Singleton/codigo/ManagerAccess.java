public class ManagerAccess {
    private static ManagerAccess instance;
    private String username;
    private String password;

    private ManagerAccess() {
        username = "admin";
        password = "password";
    }

    public static ManagerAccess getInstance() {
        if (instance == null) {
            instance = new ManagerAccess();
        }
        return instance;
    }

    public void login() {
        System.out.println("Login successful as " + username);
    }

    public void logout() {
        System.out.println("Logout successful");
    }

    public void performOperation() {
        System.out.println("Performing an operation");
    }
}
