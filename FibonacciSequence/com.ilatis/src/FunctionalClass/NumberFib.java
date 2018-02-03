package FunctionalClass;

public class NumberFib {

    public static int check = 0;
    public static int checkNum = 0;

    public static void numericF(int n){
        if(n == 0)
            System.out.println("ERROR");
        else {
            FibonacciSequence.sequence(n);
            check = FibonacciSequence.seqF[n - 1];
            checkNum = n - 1;
        }

    }
    public static void conclusionNumeric(int n){
        numericF(n);
        if(n!=0) {
            System.out.println("This number in Fibonacci sequence:");
            System.out.println(check);
        }
    }

}
