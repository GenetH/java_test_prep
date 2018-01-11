public class factorTwoCount {
 static    int factorTwoCount(int n){
        int s=0;
        int count=1;
        if(n%2!=0){
            return 0;
        }
        for (int i=0;i<=n;i++){
            s=n/2;

            if(s%2==0){
                count++;
                n=s;
            }
            if(s%2!=0){
                break;
            }
        }
        return count;

}
public static void main(String args[]){
    System.out.println(factorTwoCount(4));
    System.out.println(factorTwoCount(48));
    System.out.println(factorTwoCount(27));}
}
