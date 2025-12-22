import java.util.Scanner;

class NumberProperties {

    // Factorial method for Strong number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Product of digits
    public static int productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Perfect Number
        int sumDivisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors == num)
            System.out.println(num + " is a Perfect number.");
        else
            System.out.println(num + " is NOT a Perfect number.");

        // 2. Strong Number
        int temp = num, sumFactorial = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumFactorial += factorial(digit);
            temp /= 10;
        }
        if (sumFactorial == num)
            System.out.println(num + " is a Strong number.");
        else
            System.out.println(num + " is NOT a Strong number.");

        // 3. Neon Number
        int square = num * num;
        if (sumOfDigits(square) == num)
            System.out.println(num + " is a Neon number.");
        else
            System.out.println(num + " is NOT a Neon number.");

        // 4. Spy Number
        if (sumOfDigits(num) == productOfDigits(num))
            System.out.println(num + " is a Spy number.");
        else
            System.out.println(num + " is NOT a Spy number.");

        // 5. Automorphic Number
        int squareNum = num * num;
        if (Integer.toString(squareNum).endsWith(Integer.toString(num)))
            System.out.println(num + " is an Automorphic number.");
        else
            System.out.println(num + " is NOT an Automorphic number.");
    }
}
