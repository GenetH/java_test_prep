import java.util.Arrays;

public class sorted {
    public static int isSorted(int[ ] a){
       Arrays.sort(a);
        for(int f:a)
         //   System.out.println(f);
        for (int i=0;i<a.length;i++){
            if(a[i]<a[i+1])
                return 1;

            }
    return 0;}
        public static void main (String args[]){
            System.out.println(isSorted(new int[]{1, 2, 3, 0}));
            System.out.println(isSorted(new int[]{1, 2, 2, 1, 3, 0}));
        //    System.out.println(isSorted(new int[]{1, 2, 3, 4}));

        }
    }

