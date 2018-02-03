import FunctionalClass.CheckingClass;
import FunctionalClass.FibonacciSequence;
import FunctionalClass.NumberFib;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the sequence: ");
        int n = scanner.nextInt();
        FibonacciSequence.enterSequence(n);
        System.out.println("Enter a sequential number you want:");
        n = scanner.nextInt();
        NumberFib.conclusionNumeric(n);
        System.out.println("Enter a number to check it in sequence:");
        n = scanner.nextInt();
        CheckingClass.checking(n);
    }
}
