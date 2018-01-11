public class polynomial {


    public static  double eval(double x, int[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            int b = i - a.length;
            sum += (a[i] * Power(x, b));
        }
        return sum;

    }

    public static double Power(double m, int n) {
        double p = 1;
        for (int i = 1; i <= n; i++) {
            p *= m;

        }
        return p;
    }

    public static void main(String args[]) {
        System.out.println(eval(3.0, new int[]{3, 2, 1}));

    }
}