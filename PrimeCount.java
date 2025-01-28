public class PrimeCount {
    public static void main(String[] args) {
        //What is Prime Sieve?
        // The Prime Sieve is an algo to efficiently generate all the prime
        // numbers upto a specified limit N.

        // Steps:
        // (1): We need to create a boolean array where each index represents is it a prime number or not
        // (2): Initially mark all the numbers from 2 to N as true
        // (3): Starting from the first prime(2) mark all the multiples of 2 as false
        // (4): Move to next number that is still marked true, and mark its all multiple as false
        // (5): Continue this until we reach square root of N
        int n=11;
        sieve(n);
    }
    public static void sieve(int n){
        boolean[]isPrime=new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int j=p*p;j<=n;j+=p){
                    isPrime[j]=false;
                }
            }
        }
        System.err.println("Prime Numbers Upto:"+n+" :");
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

}
