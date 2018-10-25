public class Reverse {


    public static void main(String[] args) {
        int[] Array={1,2,3,4,5,6,7,8,9};
        int L=Array.length;
        int[] temp=new int[L];
        System.out.println(Array);
        for(int i=0;i<=L/2;i++){
            temp[i] = Array[L-i-1];
//            Array[i]=Array[L-1-i];
//            Array[L-1-i]=temp[i];
        }
        System.out.println(temp);

    }
}

