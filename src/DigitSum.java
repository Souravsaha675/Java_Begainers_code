public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number 125 is = " + sumDigits(125));
        System.out.println("The sum of the digits in the number -125 is = " + sumDigits(-125));
        System.out.println("The sum of the digits in the number 4 is = " + sumDigits(4));
        System.out.println("The sum of the digits in the number 1254154 is = " + sumDigits(1254154));

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10)
            return -1;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;

        }
        return sum;
    }
}
