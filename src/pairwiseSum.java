import java.util.ArrayList;

public class pairwiseSum {
  public static   int[ ] pairwiseSum(int[ ] a){
      if(a==null||a.length%2!=0){
          return null;
      }  int sum=0;
      int[] arr=new int[a.length/2];
      for(int j=0;j<arr.length;j++){
      for(int i=0;i<a.length;i=i+2){

          sum=a[i]+a[i+1];

              a[j]=sum;
          }}

      return a;

  }
  public static void main(String args[]){
      System.out.println(pairwiseSum(new int[]{1,2,2}));
      System.out.println(pairwiseSum(new int[]{1,2,2,1}));
  }
}
