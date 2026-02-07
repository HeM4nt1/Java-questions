import java.util.Scanner;

class LoginSystem {
    static void checkCredentials(String correctUsername, String correctPassword, Scanner sc){

        for(int i=1;i<=3;i++) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                sc.close();
                return;
            } else {
                System.out.println("Incorrect credentials");
                System.out.println("Attempts left  " + (3 - i));
            }
        }

        System.out.println("your all attempts expired ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Hemant Singh";
        String correctPassword = "2007";

        checkCredentials(correctUsername, correctPassword, sc);

    }
}
