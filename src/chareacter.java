public class chareacter {
 public static int f(char[ ] a){
     int count=0;
     int p=0;
     int product=0;
     int val=0;
     if(a.length==0){
         return -1;
     }
     for (int i=0;i<a.length;i++){

         if(!Character.isDigit(a[i])){
           return -1;}
         val += Character.getNumericValue(a[i]) * Math.pow(10, a.length-1-i);
     }

     return val;
 }






 public static void main(String args[]){
     System.out.println(f(new char[]{'1', '3', '9'}));
     System.out.println(f(new char[]{'0', '4', '7'}));
     System.out.println(f(new char[]{'1', '+', '2'}));
     System.out.println(f(new char[]{}));


 }
}
