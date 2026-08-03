// package Day-1;
// ceil and floor 

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        int floor = (int) num; 
        int ceiling;

        if (num == floor) {
            ceiling = floor; 
        } else if (num > 0) {
            ceiling = floor + 1;
        } else {
            ceiling = floor;
            floor = floor - 1;
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceiling = " + ceiling);

        sc.close();
    }
}
