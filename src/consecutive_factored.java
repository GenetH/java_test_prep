public class consecutive_factored
{
    public static int isConsectiveFactored(int n){
        int z=0;
        int f=0;
        if(n<3){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0&&n%(i+1)==0){


                f= 1;
            break;}

        }
        return f;
    }
    public static void main(String args[]){
        System.out.println(isConsectiveFactored(90));
        System.out.println(isConsectiveFactored(24));
        System.out.println(isConsectiveFactored(105));
        System.out.println(isConsectiveFactored(-8));
        System.out.println(isConsectiveFactored(2));



    }

}
