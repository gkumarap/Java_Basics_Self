package While;

public class SumOfDigits {
    public static void main(String args[]){
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(-1));
        System.out.println(sumOfDigits(54896));
        System.out.println(sumOfDigits(45879));

    }
    public static int sumOfDigits(int number) {
        if (number<=10){ // check if the number is greater than for adding two digit
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int temp = number % 10; // 123 %10 = 3; add  3 to sum. 2nd check : 12 % 10=2; 3rd 1 % 1 is 1 so 1 added to aum
            sum +=temp; // 3+2+1
            number /=10;// 123/10 = 12.3 number will be 12, as we declare it as int; 2nd check : 12/10 = 1
            // 12 is> 0 so the next iteration goes
            // 1 is > 0 so the loop continues
            //1/10  is <0 so the loop exit
        }
        return sum;
    }


}
