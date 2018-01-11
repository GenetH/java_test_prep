public class Bean {
    public static int isBeanArray (int[ ] a){
        int sum=0;
        int f=1;
        int s=0;

        for(int i=1;i<a.length;i++) {
            int count=0;
            for (int j = 1; j <=a[i]; j++) {
                if (a[i]%j==0){
                    count++;}

            }


            //System.out.println(count);
            if (count <= 2) {

                sum += a[i];

            }
        }
//System.out.println(sum);

    if(sum==a[0]){
            s=1;
    }
    return s;
}
public static void main(String args[]){
        System.out.println(isBeanArray(new int[]{21,3,7, 9, 11, 4, 6}));
     System.out.println(isBeanArray(new int[]{10, 5, 9,5}));
    }
}
