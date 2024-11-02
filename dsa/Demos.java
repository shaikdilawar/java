import java.util.Scanner;

//to print a program from 1 to n
public class Demos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read an integer input from the user
        int num = sc.nextInt();

        // Use a different variable to iterate from 1 to num
        for (int i = 1; i <= num; i++) {
            // Print the current value of i, not num
            System.out.print(i + " ");
        }

        // Close the scanner after use
        sc.close();
    }
}
