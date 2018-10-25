public class GCD {
    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor(15, 25));

    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        int gcd = 1;
        if ((number1 < 10) || (number2 < 10)) {
            return -1;
        }
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}