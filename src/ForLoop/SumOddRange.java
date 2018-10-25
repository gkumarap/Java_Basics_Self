package ForLoop;

public class SumOddRange {
    public static void main(String args[]) {
        System.out.println(isOdd(1222));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(1,1000));
        System.out.println(sumOdd(1,-1));

    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else if (number == 1) {
            return true;
        } else {

            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start && (start >= 0) && (end >= 0))) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }else {
            return -1;
        }
        return sum;
    }
}