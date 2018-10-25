package Switch;

public class NumberToWords {
    public static void main(String args[]) {
        System.out.println(reverse(123));
        System.out.println(getDigitCount(0));
        //numberToWords(123);
        numberToWords(10);
    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        int countOfNumber=getDigitCount(number);
        int reversedValue = reverse(number);
        int countOfReversedVaule=getDigitCount(reversedValue);
        int countOfDigit = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (reversedValue > 0) {
                lastDigit = reversedValue % 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    case 0:
                        System.out.println("ZERO");
                        break;
                }
                reversedValue = reversedValue / 10;
            }
        }
        if (countOfReversedVaule<countOfNumber){
            for (int i=countOfReversedVaule;i<countOfNumber;i++ ){
                System.out.println("Zero");
            }
        }
    }// converts number to words

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if(number>0) {
            int lastDigit;
            int count = 0;
            while (number > 0) {
                lastDigit = number % 10;
                count++;
                number = number / 10;
            }
            return count;
        }
        else{
            return 1;
        }

        } // counts the digit of the numbers

    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit;
        if (number < 0) {
            number = number * (-1);
            while (number > 0) {
                lastDigit = number % 10;
                reversedNumber = reversedNumber * 10;
                reversedNumber += lastDigit;
                number = number / 10;
            }
            return -reversedNumber;
        } else {
            while (number > 0) {
                lastDigit = number % 10;
                reversedNumber = reversedNumber * 10;
                reversedNumber += lastDigit;
                number = number / 10;
            }
            return reversedNumber;
        }
    } // reverses the number as we print the word to number in reversed manner

}


