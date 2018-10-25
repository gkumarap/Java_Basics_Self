public class SharedDigit {
    public static void main(String args[]){
        System.out.println(hasSharedDigit(12,35));
        System.out.println(hasSharedDigit(15,35));
        System.out.println(hasSharedDigit(1,35));
        System.out.println(hasSharedDigit(-89,-99));

    }
    public static boolean hasSharedDigit (int number1, int number2){
        if ((number1<=9) || (number1>=100) || (number2<=9) || (number2>=100)){
            return false;
        }else{
            if ((number1%10 == number2%10) || (number1/10 == number2/10) || (number1%10 == number2/10) || (number2%10 == number1/10)){
                return true;
            }
        }
        return false;
    }
}
