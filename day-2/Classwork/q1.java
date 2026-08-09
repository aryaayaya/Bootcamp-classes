//even and odd count 

public class q1 {
    public static void main(String[] args) {
        int[] numbers = {30,2,18,17,31,54};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}

