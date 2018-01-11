public class largestAdjacentSum {
    public static int largestAdjacentSum(int[ ] a){
        int max=a[0]+a[1];
        int larg=0;
        int sum=0;
        for (int i=1;i<a.length-1;i++){
            sum=a[i]+a[i+1];
            if(max>sum){
                    larg=max;
            }
            else{

                larg=sum;

            }

        }
        return larg;

    }
    public static void main(String args[]){
       System.out.println(largestAdjacentSum(new int[]{1, 2,  3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }
}
