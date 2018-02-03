package FunctionalClass;

public class CheckingClass {
    public static void checking(int n){
        int z = 1,x = 0;
        NumberFib.numericF(z);
        x = NumberFib.check;
        do {
            z++;
            NumberFib.numericF(z);
            x = NumberFib.check;
        }while(x < n);
        if(x == n)
            System.out.println("Yes, it's number is in the Fibonacci sequence " + NumberFib.checkNum);
        if(x > n)
            System.out.println("It's number not exist in the Fibonacci sequence!");
    }
}
