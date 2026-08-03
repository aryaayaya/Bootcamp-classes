// package Day-1;
// number of zeroes 

import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                int digit = n % 10;

                if (digit == 0) {
                    count++;
                }

                n = n / 10;
            }
        }

        System.out.println("Number of zeros = " + count);

        sc.close();
    }
}
