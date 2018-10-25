package ForLoop;

public class InterestRate {

    public static void main(String args[]) {
        //calculateInterest(100,3);
        System.out.println(calculateInterest(1000, 3));


        for (int i = 0; i <= 5; i++){
            System.out.println(""+ i +"");
            System.out.println(calculateInterest(10000,i));

        }
        for (int j=8;j>=2;j--){
            System.out.println(String.format("%.2f",calculateInterest(10000,j)));
        }
    }

    public static double calculateInterest(double amount, double interest){
        return (amount*   (interest/100));

    }
}
