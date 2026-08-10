package Classwork;
// prefix sum and suffix sum

public class q4 {
    public static void main(String[] args) {
        int[] numbers = {31, 7, 8, 25, 90, 5};
        int prefixSum = 0;
        int suffixSum = 0;

        System.out.println("Prefix Sum:");
        for (int i = 0; i < numbers.length; i++) {
            prefixSum += numbers[i];
            System.out.print(prefixSum + " ");
        }

        System.out.println("\nSuffix Sum:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            suffixSum += numbers[i];
            System.out.print(suffixSum + " ");
        }
    }
}
