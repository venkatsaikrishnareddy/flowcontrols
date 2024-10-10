package FlowControls;

import java.util.Scanner;

public class CheckInputType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}

