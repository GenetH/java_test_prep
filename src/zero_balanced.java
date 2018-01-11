public class zero_balanced {
   public static int isZeroBalanced(int[ ] a){
       int count=0;
       int sum=a[0];
       int f=0;
       for (int i=0;i<a.length;i++){

           for (int j=1;j<a.length;j++){
               sum+=a[j];
           if(a[i]==(-1*a[j])){
               count ++;
           }
       }


    if(count==1&&sum==0){
           f=1;
    }}
    return f;
   }
    public static void main(String args[]){
        System.out.println(isZeroBalanced(new int[]{1, 2,2,-2, 2,-2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1,3}));
        System.out.println(isZeroBalanced(new int[]{3}));
    }

}
