/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author genet
 */
public class primeNumber {

    public static void main(String args[]) {

        System.out.println(perfectnumber(1,2));
    }

    public static int perfectnumber(int i, int j) {
        ArrayList<Integer> perfect_number;

        if (i > j) {
            int temp = i;
            i = j;

            j = temp;
        }
        int sum1 = 0;
        int sum2 = 0;

        perfect_number = new ArrayList<>();

        // int[]  perfect_number=new int[8]; 
        int count = 0;
        for (int m = 1; m < 10000; m++) {
            int sum = 0;

            for (int n = 1; n <= m / 2; n++) {
                if (m % n == 0) {
                    sum += n;
//                    System.out.println(sum);
                }
            }
//            System.out.println(sum);
            if (sum == m) {
                perfect_number.add(m);
            }

        }
        for (Integer f : perfect_number) {

//
            //break;
           // System.out.println(f);
        }
        sum2+= perfect_number.get(i)+perfect_number.get(j);
       // System.out.println(perfect_number.get(i) + perfect_number.get(j));

        return sum2;
    }
}