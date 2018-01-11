public class dual {

    public static int isDual(int[] a) {
        int sum = a[0] + a[1];
        if (a.length % 2 != 0) {
            return 0;
        }
        for (int i = 2; i < a.length - 1; i = i + 2) {
            if (sum == a[i] + a[i + 1]) {
                return 1;
            }

        }

        return 0;
    }

    public static void main(String args[]) {
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(isDual(new int[]{1, 1, 2, 2}));
        System.out.println(isDual(new int[]{1, 2, 1}));
        System.out.println(isDual(new int[]{}));

    }

}
