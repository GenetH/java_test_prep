import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class get_input {

public static void main(String args[]) {
    int num;
    System.out.println("enter a number");
    Scanner input=new Scanner(System.in);
    num=input.nextInt();
    System.out.println(num);


}}