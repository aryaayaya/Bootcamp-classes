// suffix sum

public class q5 {
    public static void main(String[] args) {
        int[] numbers = {31, 7, 8, 25, 90, 5};
        int suffixSum = 0;

        System.out.println("Suffix Sum:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            suffixSum += numbers[i];
            System.out.print(suffixSum + " ");
        }
    }
}
