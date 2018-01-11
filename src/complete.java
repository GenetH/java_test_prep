public class complete {
    public static int isComplete (int[ ] a) {
        int max = 0;
        int f=0;

            for(int j=0;j<a.length;j++){
                if(a[j]<0){
                    return 0;
                }
            if (a[j] % 2 == 0) {
                if (a[j] > max) {
                    max = a[j];
                }
            }}

        for (int i = 0; i < max; i++) {
            if(i!=max){

                for(int k=0;k<a.length;k++)
                    if(i%2==0&&i!=max){
                if(a[k]==i){
                    f=1;
                }
                else
                    f=0;

            }
            }
        }
        return f;
    }

    public static void main(String args[]){
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
    }

}
