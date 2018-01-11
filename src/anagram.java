import java.util.Arrays;

public class anagram {
   public static int areAnagrams(char [ ] a1, char [ ] a2){
       int p=0;
       if(a1.length!=a2.length){
           return 0;
       }
       if(a1==null&&a2==null){
           return 0;
       }
       Arrays.sort(a1);
       Arrays.sort(a2);
       if(Arrays.equals(a1, a2)){
        p=1;}
        return p;

       }
   public static void main(String args[]){
       System.out.println(areAnagrams(new char[]{'s', 'i', 't'},new char[]{'i', 't', 's'}));
      System.out.println(areAnagrams(new char[]{'s', 'i', 't'},new char[]{'i', 'd', 's'}));
       System.out.println(areAnagrams(new char[]{'b', 'i', 'g'},new char[]{'b', 'i', 't'}));
     System.out.println(areAnagrams(new char[]{},new char[]{}));
     System.out.println(areAnagrams(new char[]{'s', 'i'},new char[]{'i', 't', 's'}));

   }
}
