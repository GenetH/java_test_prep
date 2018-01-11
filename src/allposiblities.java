import java.util.Arrays;

public class allposiblities {
   static int isAllPossibilities(int[ ] a) {
     //  Arrays.sort(a);
       //System.out.println(a);
       //for(f:a)
       for (int i = 0; i < a.length; i++) {
           if (i != a[i]) {

               return 0;
           }
       }
       return 1;
   }
    public static void main(String args[]){

System.out.println(isAllPossibilities(new int[]{0,1,2,4}));}}