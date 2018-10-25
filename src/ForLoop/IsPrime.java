package ForLoop;

public class IsPrime {

    public  static void main(String args[]){
        System.out.println(isPrime(2111));

        int count =0;
        for(int i=0;i<=50;i++){
            if (isPrime(i)){
                count++;
                System.out.println("number is"+i+"and value is "+isPrime(i));
                if(count==10) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
            //System.out.println(isPrime(i));
            //System.out.println("number is "+i+"and the the result is "+isPrime(i));
        }

    }
    public static Boolean isPrime(int number){
        if(number==1){ // Number is prime only if it is greater than 1.
            return false;
        }
        for(int i=2;i<=number/2;i++){ // check if the number of iteration , if the number is 1 then i=2; 2<=1(2/2);2++
            if(number % i==0){
                return  false;

            }
        }
        return true;
    }
}
