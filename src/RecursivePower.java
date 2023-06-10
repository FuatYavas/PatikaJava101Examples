import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent value: ");
        int exponent = scanner.nextInt();
        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}