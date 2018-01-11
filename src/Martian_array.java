public class Martian_array {

    public static int isMartian(int[ ] a){

        if(a==null){
            return 0;
        }
        int count1=0;
        int count2=0;
        int martin=0;


        for (int i = 0, j = a.length - 1; i < j ; i++, j--){


            if(a[i]==1) {
                count1++;
            }

            if(a[i]==2){
                count2++;
            }
            if(a[i]==a[i+1]) {
                martin=0;
                break;
            }

        if(count1>count2){
            martin=1;
        }}
        return martin;
    }
    public static void main(String args[]){
        System.out.println(isMartian(new int[]{1,3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2,1}));
        System.out.println(isMartian(new int[]{3, 2}));
      System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
//        System.out.println(isMartian());
//        System.out.println(isMartian());
//        System.out.println(isMartian());
//        System.out.println(isMartian());
//        System.out.println(isMartian());
    }
}