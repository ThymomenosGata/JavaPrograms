package FunctionalClass;

public class FibonacciSequence {

    public static int[] seqF;

    public static void sequence(int n){
        int[] seq = new int[n];
        if(n == 0)
            System.out.println("sequence not found");
        else if(n == 1)
            seq[0] = 0;
        else{
            seq[0] = 0;
            seq[1] = 1;
            for(int i = 2; i<n; i++){
                seq[i] = seq[i-2] + seq[i-1];
            }
        }
        seqF = new int[n];
        for (int i = 0; i<n; i++)
            seqF[i] = seq[i];
    }

    public static void enterSequence(int n){
        sequence(n);
        if(n!=0)
            System.out.println("Fibonacci sequence:");
        for (int i = 0; i<n; i++){
            System.out.print(seqF[i] + " ");
        }
        System.out.println();
    }


}
