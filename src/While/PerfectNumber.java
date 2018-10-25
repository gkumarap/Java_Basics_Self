package While;

public class PerfectNumber {
    public static void main(String args[]){
        isPerfectNumber(0);
        //System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(6));


    }
    public static Boolean isPerfectNumber(int num){
        if(num<1){
            return false;
        }
        int i=0;
        int j=1;
        while (j<num){
        //for (int i=1;i<num;i++){
            if (num%j==0){
                i+=j;
            }if (num==i){
                return true;
            }
            j++;
        }
        return false;
    }
}
