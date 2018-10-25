public class Palindrome {
    public static void main(String args[]) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12213));


    }

    public static Boolean isPalindrome(int number) {
        int enteredNumber=number;
        int reverse = 0;
        while (number != 0) {
            int lastDigitOfTheEnteredNumber = number % 10;// find the last digit of the variable
            reverse = reverse * 10; // increase the place value by 1. here increasing the value of the reverse variable
            reverse += lastDigitOfTheEnteredNumber;
            number = number / 10; // this is to remove the last digit as the last digit was processed.
        }
        if (enteredNumber==reverse){
            return true;
        }
        return false;
    }
}
