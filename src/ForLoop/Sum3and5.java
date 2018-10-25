package ForLoop;

import javax.sound.midi.Soundbank;

public class Sum3and5 {
    public static void main(String args[]){

        int count =0;
        int sum=0;
        for (int i=1;i<=1000;i++){
            if((i%3==0)&&(i%5==0)){
                count++;
                sum += i;
                System.out.println("the number is "+i);
            }
            if (count==10){
                System.out.println("Exit loop");
                break;
            }
        }
        System.out.println(sum);
    }
}
