import java.util.Scanner;

public class OnlineExam {

    static Scanner input = new Scanner(System.in);
    static String username, password, newpassword;
    static int choice;

    public static void main(String[] args) {
        System.out.println("Welcome to Online Exam");

        // Login process
        System.out.println("\nPlease enter your login details");
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if (login(username, password)) {
            // Update profile and password
            System.out.println("\n1. Update Profile");
            System.out.println("2. Update Password");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                updateProfile(username);
            } else if (choice == 2) {
                updatePassword(username);
            } else {
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
            }

            // MCQs
            System.out.println("\nPlease select the correct answers for the following questions:");
            System.out.println("1. What is the capital of France?");
            System.out.println("A. London");
            System.out.println("B. Berlin");
            System.out.println("C. Paris");
            System.out.println("D. Madrid");
            String answer1 = input.next();

            System.out.println("\n2. Who is the founder of Microsoft?");
            System.out.println("A. Steve Jobs");
            System.out.println("B. Jeff Bezos");
            System.out.println("C. Bill Gates");
            System.out.println("D. Mark Zuckerberg");
            String answer2 = input.next();

            System.out.println("\n3. What is the largest planet in the solar system?");
            System.out.println("A. Venus");
            System.out.println("B. Earth");
            System.out.println("C. Jupiter");
            System.out.println("D. Saturn");
            String answer3 = input.next();

            // Timer and auto submit
            int remainingTime = 300; // 5 minutes
            System.out.println("\nYou have 5 minutes to complete the exam.");
            while (remainingTime > 0) {
                System.out.println("Time remaining: " + remainingTime + " seconds");
                remainingTime--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\nTime's up!");

            // Closing session and logout
            System.out.println("Thank you for taking the exam.");
            System.out.println("Closing session and logging out.");
            System.exit(0);

        } else {
            System.out.println("Invalid login details. Exiting.");
            System.exit(0);
        }
    }

    // Login method
    public static boolean login(String username, String password) {
        // Check if the username and password match
        // This can be replaced with a database query
        if (username.equals("user123") && password.equals("password123")) {
            return true;
        } else {
            return false;
        }
    }

    // Update profile method
    public static void updateProfile(String username) {
        System.out.println("Updating profile for " + username);
        // Add code to update the user's profile
    }

    // Update password method
    public static void updatePassword(String username) {
        System.out.print("Enter your new password: ");
        newpassword = input.next();
        System.out.println("Updating password for " + username);
        // Add code to update the user's password
    }
}
