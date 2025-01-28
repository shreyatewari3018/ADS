public class CountLR {
    public static void main(String[] args) {
        //Given two integers L and R, find how many prime numbers lies in between L and R
        int L=10;
        int R=30;
        System.err.println("The count of L and R is "+countP(L,R));
    }
    public static int countP(int L,int R){
        int[]primes=new int[R+1];
        for(int i=0;i<=R;i++){
            primes[i]=1;
        }
        primes[0]=primes[1]=0;
        for(int i=2;i+i<=R;i++){
            if(primes[i]==1){
                for(int j=i*i;j<=R;j+=i){
                    primes[j]=0;

                }
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(primes[i]==1){
                count++;
            }
        }
        return count;
    }
}
