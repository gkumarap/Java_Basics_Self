package While;

public class LargestPrime {
    public static void main(String argsa[]){

        System.out.println(getLargestprime(21));
        System.out.println(getLargestprime(217));
        System.out.println(getLargestprime(0));
        System.out.println(getLargestprime(45));
        System.out.println(getLargestprime(-1));


    }
    public static int getLargestprime(int number){
        if(number<2){
            return -1;
        }else{
            int dividor=2; // this is the actual dividor as numner 1 is not a prime number itself
            while (number!=1) {
                while (number % dividor == 0) {
                    number /= dividor;
                }
                dividor++;
            }
            return dividor-1;
        }
    }
}
