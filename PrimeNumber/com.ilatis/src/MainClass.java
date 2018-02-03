import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String flag = "yes";
        while (flag.equals("yes")){
            System.out.println("if you want the next prime number - enter 'yes', else - 'no':");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextLine();
            if(!flag.equals("no")) {
                PrimeNumber.nextPrimeNumber();
                System.out.println(PrimeNumber.prNum);
            }
        }

    }
}
