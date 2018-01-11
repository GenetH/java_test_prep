public class hollow {
   public static int isHollow(int[ ] a){
       int count=a.length;
       int zerocount=0;
       int i;
       int j;
       int istart;
       int jstart;

       if(count%2==0){
           istart=(count/2)-1;
           jstart=count/2;
       }else{
           istart=count/2;
           jstart=count/2;
       }

       for(i=istart, j=jstart; i>=0; i--, j++){
           if(a[i]==0 && a[j]==0)
               zerocount++;
           else if(a[i]!=0 && a[j]!=0){
               break;
           }else{
               zerocount=0;
               break;
           }
       }

       if(zerocount>1)
           return 1;
       else
           return 0;

   }

    public static void main(String args[]){
        System.out.println(isHollow(new int[] {1,2,0,0,0,3,4}));

        System.out.println(isHollow(new int[] {1,1,1,1,0,0,0,0,0,2,1,2,18}));
        System.out.println(isHollow(new int[] {1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[] {1,2,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[] {3,8,3,0,0,0,3,3}));
        System.out.println(isHollow(new int[] {1,2,0,0,0,3,4,0}));
        System.out.println(isHollow(new int[] {0,1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[] {0,0}));
    }

}
