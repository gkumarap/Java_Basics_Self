public class EqualSum {

    public static void main(String args[]){
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
    }
    public static boolean hasEqualSum(int a, int b, int c){
        int equalSum=(a+b);

        if (equalSum == c){
            return true;
        }else{
            return false;
        }
    }
}
