public class sumDigits {
    public static int sumDigits (int n){
        if(n<0){
            n=-1*n;
        }
int sum=0;
        while (n!=0){
        sum+=n%10;
        n/=10;
    }

    return sum;
}
public static void main(String args[]){
    System.out.println(sumDigits(3114));
    System.out.println(sumDigits(-56));
    }
}

