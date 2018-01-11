public class twin_prime {
    public static int isTwinPrime(int n){

        if(n<=2){
            return 0;
        }
        int prime=1;
        int f=1;
        int p=1;
        int k=1;
        for(int i=2;i<=n/2;i++) {

            if (n % i == 0  ) {
                f = 0;
                break;
            }

        }
        int z=n+2;
        int y=n-2;

            for(int j=2;j<=z/2;j++) {
                if (z % j == 0) {
                    p = 0;
                    break;
                }
            }
            for(int j=2;j<=y/2;j++) {
                if (y % j == 0) {
                    k= 0;
                    break;
                }
            }
            if((f==1&&p==1)||(f==1&&k==1)){
                prime =1;
            }
        if (k == 0 && p == 0) {
                prime=0;
        }
        if(f==0){
            prime=0;
        }


return prime;
    }
    public static void main(String args[]){
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(9));
        System.out.println(isTwinPrime(53));
    }
}
