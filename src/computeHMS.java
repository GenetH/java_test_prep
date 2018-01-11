import java.util.ArrayList;

public class computeHMS {
    public static ArrayList computeHMS(int seconds){
        int hours=seconds/3600;
        int minute=(seconds%3600)/60;
        int second=((seconds%3600)%60);
        ArrayList time=new ArrayList();
        time.add(hours);
        time.add(minute);
        time.add(second);

       return time;


    }
    public static void main(String args[]){
        System.out.println(computeHMS(3735));
        System.out.println(computeHMS(380));
        System.out.println(computeHMS(3650));
        System.out.println(computeHMS(55));
        System.out.println(computeHMS(3650));

    }
}
