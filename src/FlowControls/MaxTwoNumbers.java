package FlowControls;

import java.util.Scanner;

public class MaxTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The maximum number is: " + num1);
        } else {
            System.out.println("The maximum number is: " + num2);
        }
    }
}
