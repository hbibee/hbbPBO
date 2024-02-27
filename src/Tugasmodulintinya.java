import java.util.Scanner;

public class Tugasmodulintinya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String nimStudent = scanner.nextLine();
                    if (isStudentNIM(nimStudent)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();
                    if (isAdmin(username, password)) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the library.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
                    break;
            }
        }
    }

    private static boolean isStudentNIM(String nim) {
        return nim.equals("202310370311161");
    }

    private static boolean isAdmin(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
