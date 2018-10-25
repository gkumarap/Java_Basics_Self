public class SumFirstAndLastDigit {
    public static void main(String args[]){
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-252));
        System.out.println(sumFirstAndLastDigit(5));



    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }else{
            int firstDigit=0; // initialize first and last digit
            int lastDigit=0; //
            lastDigit=number%10; // find the last digit of the number
            int sum=0; // intializing the sum variable
            while(number!=0){
                if (number/10==0){ // checking for the first digit.
                    firstDigit=number;
                    sum=firstDigit+lastDigit;
                    break;
                }
                number=number/10; // this does the check,
                // if the number/10 is !0, it means that it is still not in first digit
            }return sum;
        }
    }
}
