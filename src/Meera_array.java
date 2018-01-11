public class Meera_array {
    public static void main(String args[]){
        System.out.println(isMeera(new int[]{1,2}));
        System.out.println(isMeera(new int[]{-4,0}));
    }
 static    int isMeera (int[ ] a){
        int f=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>i){
                f=0;
            }
        }
        return f;
    }
}
