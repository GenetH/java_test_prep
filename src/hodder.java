public class hodder {
    public static int isHodder(int n){
        int p=1;
        int k=0;
        int hodder=0;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                p=0;
                break;

        }
        if(p==1){
            for(int j=2;j<50;j++){
                k=Power(2,j)-1;
                if(k==n){
                    hodder=1;

                    break;
                }

            }
        }
        return hodder;
    }
    public static int Power(int a,int b){
        int product=1;
        for(int i=1;i<=b;i++){
            product*=a;

        }
        return product;
    }
    public static void main(String args []){
        System.out.println(isHodder(7));
        System.out.println(isHodder(3));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
    }
}
