public class Dual_array {
    public static void main(String args[]){
        System.out.println(isDual(new int[]{1,2,2,3}));
        System.out.println(isDual(new int[]{1,2,2,1,1}));
    }
    public static  int isDual (int[ ] a){
        int count=0;
        int f=1;
        for(int i=0;i<a.length;i++){
            for (int j=1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;

                }
            }
            if(count<2){
                f=0;
                break;
            }
        }
        return f;
    }
}
