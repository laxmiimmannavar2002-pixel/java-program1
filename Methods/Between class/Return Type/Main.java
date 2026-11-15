class LoginService {

    public static boolean validateLogin(String username, String password) {

        if (username.equals("admin") && password.equals("admin123")) {

            return true;

        } else {

            return false;

        }
    }
}
class Main {

    public static void main(String[] args) {

        boolean result = LoginService.validateLogin("admin", "admin123");

        System.out.println("Login Status: " + result);

    }
}