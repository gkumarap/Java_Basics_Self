public class EvenDigitSum {
    public static void main(String arga[]) {
        System.out.println(getEvenDigitSum(125689));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int evenDigit = 0;
//            int currentDigit=0;
            while (number > 0) {
                int currentDigit = number % 10;
                if (currentDigit % 2 == 0) {
                    evenDigit += currentDigit;
                }
                number = number / 10;
            }
            return evenDigit;
        }
    }
}
