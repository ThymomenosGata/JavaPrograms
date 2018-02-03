public class PrimeNumber {

    public static int prNum = 1;
    public static void nextPrimeNumber(){
        prNum++;
        boolean flag = false;
        int startNum = prNum;
        while(!flag){
            flag = isPrime(startNum);
            if(!flag)
                startNum++;

        }
    }
    public static boolean isPrime(int n){
        int z = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                z++;
            }
        }
        if(z>2)
            return false;
        else {
            prNum = n;
            return true;
        }

    }
}
