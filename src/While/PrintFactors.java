package While;

public class PrintFactors {
    public static void main(String args[]){
        printFactors(0);
        printFactors(10);

    }
    public static void printFactors(int num){
        if(num<1){
            System.out.println("Invalid Value");
        }
        int i=1;
        while (i<=num){
            if (num%i==0){//Check the remainders here
                System.out.println(i);
            }
            i++;
        }

    }
}
