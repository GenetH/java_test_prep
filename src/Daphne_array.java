public class Daphne_array {
    static  int isDaphne (int[ ] a){
        int count=0;
        int s=0;
        int oddcount=0;
        int countstart=0;
        int countend=0;


            for (int i = 0, j=a.length-1; i<=j; i++, j--) {
            if(a[i]%2!=0||a[j]%2!=0){
              oddcount++;
            }
            if(a[i]%2==0){
                countstart++;
            }
            else
                break;
            if(a[j]%2==0){
                countend++;

            }
            else
                break;

        }


        if(oddcount>=1&&countstart==countend){
                s=1;
        }
        return s;
    }
    public static void main(String args[]){
        System.out.println(isDaphne(new int[]{2,4,6,7,8,12,24}));
        System.out.println(isDaphne(new int[]{2,4,6,7,8,12}));
    }
}
