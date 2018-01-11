public class distinict {
   static int f(int [] a) {

       int count = 1;
       if(a.length==0){
           count=0;
       }

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
       System.out.println(f(new int[]{1,2,3,4,5,5}));
        System.out.println(f(new int[]{5,5,5,5}));
        System.out.println(f(new int[]{}));

    }
}
