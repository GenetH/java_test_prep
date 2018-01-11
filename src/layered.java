public class layered {
    public static int isLayered(int[ ] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
            if(a[i]<=a[j]&&a[i]==a[j]){
                count++;
            }
        }
    }
    return count;
}
    public static void main(String args[]) {
        System.out.println(isLayered(new int[]{3, 2, 1}));
    }}