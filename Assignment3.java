public class Assignment3 {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
        // executes until the condition returns true
        for (i = 1; i <= num; ++i) {

            sum = sum + i;
        }
        // prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}