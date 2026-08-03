// multiplication of a table 

import java.util.Scanner;

public class Q1{
    public static void main(String[] agrs){
       Scanner sc = new Scanner(System.in);

       System.out.print("enter a number: ");
       int n = sc.nextInt();

       for ( int i = 1; i<=10; i++){
        System.out.println(n + "x" + i + " = " + (n*i));
       }
       sc.close();
}
}