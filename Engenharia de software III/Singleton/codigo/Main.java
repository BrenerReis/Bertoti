public class Main {
    public static void main(String[] args) {
        ManagerAccess manager = ManagerAccess.getInstance();
        manager.login();
        manager.performOperation();
        manager.logout();
    }
}