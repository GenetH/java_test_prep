public class goodSpread {
    public static int goodSpread (int[ ] a){

    int count=0;
    int num=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j])
                    count++;}
                    if(count>=3){
                num=1;
                break;

                    }

        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(goodSpread(new int[]{1,3,2,3,3,1}));
        System.out.println(goodSpread(new int[]{1,3,2,3,3,1,3}));
        System.out.println(goodSpread(new int[]{1,3,2}));
    }
}
