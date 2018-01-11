public class nextPerfectSquare {
    public static int isPerfectSquare(int n){
        int product=0;
        int sqrt=1;
        int p=0;
        if(n<0){
            p=0;
        }
        for (int i=0;i<=n;i++){
            product=i*i;
          if(n==product){
              p=(i+1)*(i+1);
              break;
          }
          if(product>=n){
              p=i*i;
              break;


          }
        }
        return p;
    }


    public static void main(String args[]){
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
        }
}
